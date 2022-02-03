import jdk.swing.interop.SwingInterOpUtils;

public class MainProdavnica {
    public static void main(String[] args) {

        Kafa[] kafeNiz = new Kafa[3];
        kafeNiz[0] = new Kafa("Nescafe","velika",new String[]{"kafa","mleko","voda","secer"}, 100);
        kafeNiz[1] = new Kafa("Espresso","mala",new String[] {"kafa","voda","secer"},150);
        kafeNiz[2] = new Kafa("Latte","velika",new String[]{"kafa","mleko","secer"},200);

        Kafa[] kafeNiz2 = new Kafa[2];
        kafeNiz2[0] = new Kafa("Frappe","velika",new String[]{"kafa","voda"},125);
        kafeNiz2[1] = new Kafa("Macchiato","mala",new String[]{"kafa","mleko"},130);

        Prodavnica prodavnica1 = new Prodavnica(kafeNiz,"Maksima Gorkog");
        Prodavnica prodavnica2 = new Prodavnica(kafeNiz2,"Danila Kisa");
        Prodavnica[] lanacProdavnica = new Prodavnica[2];
        lanacProdavnica[0] = prodavnica1;
        lanacProdavnica[1] = prodavnica2;

     //   System.out.println(Prodavnica.getBrojProdavnica());

        prodavnica1.kupiKafu(kafeNiz[0],2);
        prodavnica2.kupiKafu(kafeNiz2[0],1 );
        prodavnica2.kupiKafu(kafeNiz2[1],3);

        Prodavnica.najuspesnijaProdavnica(lanacProdavnica).popustNaSveKafe(20);
        System.out.println(Prodavnica.najuspesnijaProdavnica(lanacProdavnica));

        stampajKafu(kafeNiz2);

    }

    public static void stampajKafu(Kafa[] nizKafa){
        for (Kafa kafa : nizKafa){
            System.out.println(kafa.getNaziv() + " " + kafa.getCena());
        }
    }
}

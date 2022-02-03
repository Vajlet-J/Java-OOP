public class Prodavnica {
    private Kafa[] kafe;
    private String adresa;
    private static int brojProdavnica = 0;
    private int brojKupljenihProizvoda;

    public Prodavnica(Kafa[] kafe, String adresa){
       brojProdavnica++;
        this.kafe = kafe;
        this.adresa = adresa;
    }

    public Kafa [] getKafa(){
        return kafe;
    }

    public void setKafe(Kafa[] kafa){
        this.kafe = kafe;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public static int getBrojProdavnica() {
        return brojProdavnica;
    }

    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        this.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }



    public void kupiKafu(Kafa vrstaKafe, int kolicinaKafe){
    double racun = vrstaKafe.getCena() * kolicinaKafe;
        System.out.println("Vas racun za: " + vrstaKafe.getNaziv() + " je: " + racun);
    }


    public static Prodavnica najuspesnijaProdavnica(Prodavnica[] lanacProdavnica){
        int provera = 0;
        for(int i = 1; i < lanacProdavnica.length; i++){
           if(lanacProdavnica[i-1].getBrojKupljenihProizvoda() < lanacProdavnica[i].getBrojKupljenihProizvoda()){
               System.out.println(lanacProdavnica[i]);
               provera = 1;
           }else{
               System.out.println(lanacProdavnica[i-1]);
               provera = i -1;
           }
        }
        return lanacProdavnica[provera];
    }


    public void popustNaSveKafe(int procenat) {
        for (Kafa kafa : this.kafe) {
            kafa.obracunajPopust(procenat);
        }
    }

}

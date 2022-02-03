package Nalepnica;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flasa> listaFlasa = new ArrayList<Flasa>();

        Nalepnica n1 = new Nalepnica("Ivana");
        Nalepnica n2 = new Nalepnica("Violeta");
        Nalepnica n3 = new Nalepnica("Sanja");

        listaFlasa.add(new StaklenaFlasa(n1,70,0.7,VrstaPica.ALKOHOLNO));
        listaFlasa.add(new StaklenaFlasa(n2,120,1,VrstaPica.ALKOHOLNO));
        listaFlasa.add(new PlasticnaFlasa(n3,150,0.5,VrstaPica.BEZALKOHOLNO));

        double sumaFlasa = 0;
        for(Flasa f : listaFlasa){
            sumaFlasa += f.getCenaSaKaucijom();
            if (f.getNalepnica().getIdentifikator() == 1) {
                System.out.println(f);
            }
        }
        System.out.println("Suma flasa: " + sumaFlasa);
    }
}

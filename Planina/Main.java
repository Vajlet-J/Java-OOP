package Planina;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Planina plan = new Planina("Stara","Srbija",3000);

        List<Planinar> planinari = new ArrayList<>();

        RekreativniPlaninar rp1 = new RekreativniPlaninar(1,"Jovca","Markovic",7,"NoviSad",2700);
        RekreativniPlaninar rp2 = new RekreativniPlaninar(2,"Nikola","Maovic",10,"NoviSivac",4000);
        RekreativniPlaninar rp3 = new RekreativniPlaninar(3,"Milan","Vukovic",3,"Sombor",1700);

        Alpinista a1 = new Alpinista(1,"Danijela","Cvijovic",14);
        Alpinista a2 = new Alpinista(2,"Milana","Cviic",10);
        Alpinista a3 = new Alpinista(3,"Vanja","Pijovic",20);

        planinari.add(rp1);
        planinari.add(rp2);
        planinari.add(rp3);
        planinari.add(a1);
        planinari.add(a2);
        planinari.add(a3);

        for(Planinar p : planinari){
            p.stampaj();
            System.out.println(p.uspesanUspon(plan));
        }

        double sumaClanarina = 0;

        for (Planinar p : planinari){
           sumaClanarina += p.clanarinaPlaninara();

        }
        System.out.println("Suma svih clanarina je: " + sumaClanarina);

}
}

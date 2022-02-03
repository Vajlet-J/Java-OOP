import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Planina plan = new Planina("Stara planina","Srbija",3000);
        ArrayList<Planinar> planinari = new ArrayList<>();

         RekreativniPlaninar rp1 = new RekreativniPlaninar(100,"Marko", "Vracar",17,"Novi Sad",3000);
         RekreativniPlaninar rp2 = new RekreativniPlaninar(200,"Milan","Milovanovic",15,"Beograd",2500);
         RekreativniPlaninar rp3 = new RekreativniPlaninar(300,"Jovan","Jovanovic",14,"Cacak",3500);

         Alpinista a1 = new Alpinista(10,"Dragana","Zivanovic");
         Alpinista a2 = new Alpinista(20,"Milica","Sekulic");
         Alpinista a3 = new Alpinista(30,"Natasa","Kovacevic");

         planinari.add(rp1);
         planinari.add(rp2);
         planinari.add(rp3);
         planinari.add(a1);
         planinari.add(a2);
         planinari.add(a3);

         PlaninarskiDom domPlaninara = new PlaninarskiDom("Planinarski dom Tara",1955,planinari);

      //  System.out.println(domPlaninara);

        //domPlaninara.izbaciPlaninara(rp1);
//        System.out.println(domPlaninara);

//        System.out.println(domPlaninara.sumaClanarina());

//        domPlaninara.uclaniPlaninara(rp1);
//        System.out.println(domPlaninara);

 //       System.out.println(domPlaninara.uspesnoPopetiPlaninari(plan));


    }
}

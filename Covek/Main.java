package Covek;

public class Main {
    public static void main(String[] args) {
        Autobus bus = new Autobus("Severtrans",500,75);

        Putnik p1 = new Putnik("Marija","Kojic",14500);
        Putnik p2 = new Putnik("Jovan","Petrovic",2500);
        Putnik p3 = new Putnik("Nikola","Milovic",850);

        Vozac v1 = new Vozac("Ivan","Ivanovic","Vozac");

        bus.postaviVozaca(v1);
        System.out.println(v1);

        bus.dodajPutnika(p1);
        bus.dodajPutnika(p2);
        bus.dodajPutnika(p3);

        bus.izbaciPutnika(p2);

        bus.naplataKarata();

        System.out.println(bus);



    }
}

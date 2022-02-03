package Pozoriste;

public class Main {
    public static void main(String[] args) {
        Pozoriste mladih = new Pozoriste("Pozoriste Mladih");
        Predstava aska = new Predstava("Aska",mladih);

        // Zaposleni z = new Zaposleni("jovan",mladih);

        Zaposleni glumac1 = new Glumac("Marko Markovic",mladih,"glavna");
        Zaposleni glumac2 = new Glumac("mila jovovic",mladih,"sporedna");

        Zaposleni r1 = new Reditelj("milos milosevic",mladih,"miki");

        aska.dodajZaposlenog(glumac1);
        aska.dodajZaposlenog(glumac2);
        aska.dodajZaposlenog(r1);

        //System.out.println(aska.brojZaposlenih());

        System.out.println(aska);

        //System.out.println(glumac1);

    }
}

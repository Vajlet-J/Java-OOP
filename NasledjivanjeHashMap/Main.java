package NasledjivanjeHashMap;

public class Main {
    public static void main(String[] args) {
        Fabrika f1 = new Fabrika("Bambi");

        Zaposleni z1 = new Zaposleni("4864768","Marko","Vracar",1500.5,true);
        Zaposleni z2 = new Zaposleni("486748","Violeta","Jokic",9456.5,false);
        Zaposleni z3 = new Zaposleni("894","Ivana","Markovic",7895.6,true);

        f1.zaposli(z1);
        f1.zaposli(z2);
        f1.zaposli(z3);

        System.out.println(f1);

        f1.otpusti("486748",55);

        System.out.println(f1);

       // System.out.println(f1.ispisiJmbgZapodlenih());

        //System.out.println(f1.prosek());

    }
}

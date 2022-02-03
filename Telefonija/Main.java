package Telefonija;

public class Main {
    public static void main(String[] args) {
        Broj markovBroj = new Broj("387","069","8744186",false);
        Broj violetinBroj = new Broj("381","066","8412363",false);

        Korisnik marko = new Korisnik("Marko","Vracar",markovBroj);
        Korisnik violeta = new Korisnik("Violeta","Jokic",violetinBroj);

        marko.posaljiPoruku(violetinBroj,"Sta radis? Kako ide programiranje?");
        violeta.posaljiPoruku(markovBroj,"Evo patim se.");
        marko.posaljiPoruku(violetinBroj,"Ako,i treba.");

        violeta.poziv(markovBroj,180);
        marko.poziv(violetinBroj,125);

        System.out.println(marko);
        System.out.println(violeta);

        System.out.println(marko.cenaSvihUsluga());
        System.out.println(violeta.cenaSvihUsluga());

    }
    private static boolean proveriDaLiStringSadrziSamoNumerike(String s){
        boolean jesteBroj = true;
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))) jesteBroj = false;
        }
        return jesteBroj;
    }

    private static boolean proveriBroj(String kodDrzave,String pozivniBroj,String broj){
    if(!kodDrzave.equals(null) && kodDrzave.length() == 3 && proveriDaLiStringSadrziSamoNumerike(kodDrzave)
    && !pozivniBroj.equals(null) && pozivniBroj.length() == 2 && proveriDaLiStringSadrziSamoNumerike(pozivniBroj)
    && !broj.equals(null) && (broj.length() == 7 || broj.length() == 8) && proveriDaLiStringSadrziSamoNumerike(broj))
        return true;
    else return false;
    }
}

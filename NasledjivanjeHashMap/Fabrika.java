package NasledjivanjeHashMap;

import java.util.HashMap;

public class Fabrika implements RadSaMapom,ProsecnaZarada {
    private String naziv;
    private HashMap<String,Zaposleni> zaposlenii = new HashMap<>();

    public Fabrika(String naziv) {
        this.naziv = naziv;
       // this.zaposleni = new HashMap<>();
    }


    @Override
    public double prosek() {
       if(!zaposlenii.isEmpty()){
         double suma = 0;
         for(Zaposleni p : zaposlenii.values()){
             suma += p.getMesecnaZarada();
         }
         return suma/ zaposlenii.size();
       }else{
           System.out.println("Lista je prazna");
           return 0;
       }
    }

    @Override
    public boolean zaposli(Zaposleni z) {
       if(zaposlenii.containsKey(z.getJmbg())){
           System.out.println("Neuspesno zaposljavanje");
           return false;
       }
        System.out.println("Uspesno zaposljavanje");
        zaposlenii.put(z.getJmbg(), z);
        return true;
    }

    @Override
    public Zaposleni otpusti(String s, double d) {
        Zaposleni otpusteni = null;
        for(Zaposleni e : zaposlenii.values()){
            if((e.getJmbg().equals(s)) && e.getMesecnaZarada() > d){
                otpusteni = e;
                zaposlenii.remove(e.getJmbg());
                return otpusteni;
           }
        }
        return null;
    }

    @Override
    public String ispisiJmbgZapodlenih() {
       StringBuilder sb = new StringBuilder();
        for(String i : zaposlenii.keySet()){
          sb.append(i + "\n");
       }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Fabrika{" + "\n" +
                "naziv='" + naziv + '\'' +
                ", zaposlenii=" + zaposlenii + "}" + "\n";
    }
}

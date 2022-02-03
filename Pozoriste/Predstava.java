package Pozoriste;

import java.util.ArrayList;

public class Predstava {
    private String naziv;
    private Pozoriste pozoriste;
    private ArrayList<Zaposleni> zaposleniNiz = new ArrayList<>();

    public Predstava(String naziv, Pozoriste pozoriste) {
        this.naziv = naziv;
        this.pozoriste = pozoriste;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    public void setPozoriste(Pozoriste pozoriste) {
        this.pozoriste = pozoriste;
    }


    public void dodajZaposlenog(Zaposleni z){
        zaposleniNiz.add(z);
        System.out.println("U listu zaposlenih dodali ste zaposlenog: " + z.getImeIPrezime());
     }

     public void izbaciZaposlenog(Zaposleni z){
        zaposleniNiz.remove(z);
        System.out.println("Iz liste zaposlenih izbacili ste zaposlenog: " + z.getImeIPrezime());
    }

    public int brojZaposlenih(){
        return zaposleniNiz.size();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Zaposleni z : zaposleniNiz){
            sb.append(z);
        }
        return sb.toString();

       // return naziv + " , " + pozoriste.getNaziv() + "\n" + zaposleniNiz.toString();

    }

}

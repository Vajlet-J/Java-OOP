package Telefonija;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Korisnik {
    private int identifikator;
    private static final AtomicInteger count = new AtomicInteger(0);
    private String ime;
    private String prezime;
    private Broj broj;
    private ArrayList<Usluga> istorijaUsluga = new ArrayList<>();

    public Korisnik(String ime,String prezime, Broj broj) {
        this.identifikator = count.incrementAndGet();
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.istorijaUsluga = istorijaUsluga;
    }

    public int getIdentifikator() {
        return identifikator;
    }

    public String getIme() {
        return ime;
    }

    public Broj getBroj() {
        return broj;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + broj + "\n" + "istorijaUsluga:" + "\n" + istorijaUsluga.toString();
    }

    public void posaljiPoruku(Broj b,String textPoruke){
        Poruka poruka = new Poruka(this.broj,b,textPoruke);
        istorijaUsluga.add(poruka);
    }

    public void poziv(Broj b,int trajanjePoziva){
        Poziv poziv1 = new Poziv(this.broj,b,trajanjePoziva);
        istorijaUsluga.add(poziv1);
    }

    public double cenaSvihUsluga (){
        double sumaSvihUsluga = 0;
        for(Usluga u : istorijaUsluga){
            sumaSvihUsluga += u.cenaUsluge();
        }
        return sumaSvihUsluga;
    }


}

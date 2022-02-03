package Covek;

public class Putnik extends Covek{

    private double novac;

    public Putnik(String ime, String prezime,double novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public double getNovac() {
        return novac;
    }

    public void dodajNovac(double pare){
        novac = novac + pare;
        System.out.println("Uspesno dodat novac.Trenutno stanje: " + getIme() + "je: " + novac);
    }

    public void oduzmiNovac(double pare){
        novac = novac - pare;
        System.out.println("Uspesno oduzet novac. Trenutnostanje: " + getIme() + "je: " + novac);
    }
}

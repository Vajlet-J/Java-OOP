package Covek;

import java.util.ArrayList;

public class Autobus {
    private String naziv;
    private Vozac vozac;
    private double cenaKarte;
    private int sedista;
    private ArrayList<Putnik> nizPutnika= new ArrayList<>();
    private boolean vozacPostoji;

    public Autobus(String naziv, double cenaKarte, int sedista) {
        this.naziv = naziv;
        this.cenaKarte = cenaKarte;
        this.sedista = sedista;

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }

    public double getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(double cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public int getSedista() {
        return sedista;
    }

    public void setSedista(int sedista) {
        this.sedista = sedista;
    }

    public ArrayList<Putnik> getNizPutnika() {
        return nizPutnika;
    }

    public void setNizPutnika(ArrayList<Putnik> nizPutnika) {
        this.nizPutnika = nizPutnika;
    }

    public void dodajPutnika(Putnik p){
        nizPutnika.add(p);
        System.out.println("Uspesno ste dodaj putnika: " + p.getIme());
    }

    public void izbaciPutnika(Putnik p){
        nizPutnika.remove(p);
        System.out.println("Uspesno ste izbacili putnika: " + p.getIme());
    }
    public void postaviVozaca(Vozac v){
        setVozac(v);
        vozacPostoji = true;
    }

    public void izbaciVozaca(Vozac v){
        setVozac(null);
        vozacPostoji = false;
    }

    public void naplataKarata(){
        if(vozacPostoji == true){
            for(Putnik p : nizPutnika){
                p.oduzmiNovac(cenaKarte);
            }
            System.out.println("Naplacena je karta u vrednosti: " + getCenaKarte());
        }else{
            System.out.println("Neuspesna naplata karte.");
        }
    }

    @Override
    public String toString() {
        return "Autobus naziv: " + naziv + ", vozac=" + vozac + ", nizPutnika=" + nizPutnika.toString();
    }

}

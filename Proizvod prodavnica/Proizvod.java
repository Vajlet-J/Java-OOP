package Domaci;

public abstract class Proizvod {
    private int barKod;
    private String naziv;
    private double cena;

    public Proizvod (int barKod,String naziv,double cena){
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getBarKod() {
        return barKod;
    }

    public void setBarKod(int barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }
}

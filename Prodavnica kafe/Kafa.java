public class Kafa {
    private String naziv;
    private String velicina;
    private String [] sastojci;
    private double cena;

    public Kafa (String naziv,String velicina,String [] sastojci,double cena){
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getVelicina() {
        return velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obracunajPopust(int procenat){
        double Popust;
        Popust = cena * (procenat/100.00);
        return this.cena-=Popust;
    }
}


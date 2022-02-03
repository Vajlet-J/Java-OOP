package Atleticar;

public abstract class  Atleticar {
    private String ime;
    private String prezime;
    private double rezultat;

    public Atleticar(String ime, String prezime, double rezultat) {
        this.ime = ime;
        this.prezime = prezime;
        this.rezultat = rezultat;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getRezultat() {
        return rezultat;
    }

    public void setRezultat(double rezultat) {
        this.rezultat = rezultat;
    }


    public abstract boolean daLiJeBoljiRezultat(Atleticar acko);

    @Override
    public String toString() {
        return "Atleticar" + "\n" +
                "ime='" + ime + "\n" +
                ", prezime='" + prezime + "\n" +
                ", rezultat=" + rezultat + "\n";
    }
}

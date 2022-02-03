package Nalepnica;

public class Flasa {
    private Nalepnica nalepnica;
    private double cenaBezKaucija;
    private double zapremina;
    private VrstaPica vrstaPica;
    private double cenaSaKaucijom;

    public Flasa(Nalepnica nalepnica, double cenaBezKaucija, double zapremina,VrstaPica vrstaPica) {
        this.nalepnica = nalepnica;
        this.cenaBezKaucija = cenaBezKaucija;
        this.zapremina = zapremina;
        this.vrstaPica = vrstaPica;
    }

    public double getCenaSaKaucijom() {
        return cenaSaKaucijom;
    }

    public void setCenaSaKaucijom(double cenaSaKaucijom) {
        this.cenaSaKaucijom = cenaSaKaucijom;
    }

    public Nalepnica getNalepnica() {
        return nalepnica;
    }

    public double getCenaBezKaucija() {
        return cenaBezKaucija;
    }

    public double getZapremina() {
        return zapremina;
    }

    public VrstaPica getVrstaPica() {
        return vrstaPica;
    }

    public void setCenaBezKaucija(double cenaBezKaucija) {
        this.cenaBezKaucija = cenaBezKaucija;
    }

    @Override
    public String toString() {
        return "Flasa{" +
                "nalepnica=" + nalepnica +
                ", cenaBezKaucija=" + cenaBezKaucija +
                ", zapremina=" + zapremina +
                ", vrstaPica=" + vrstaPica +
                '}';
    }

//    public String toString(){
//        return super.toString() + "staklena";
//    }
}

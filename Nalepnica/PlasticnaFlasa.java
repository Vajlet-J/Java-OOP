package Nalepnica;

public class PlasticnaFlasa extends Flasa {


    public PlasticnaFlasa(Nalepnica nalepnica, double cenaBezKaucija, double zapremina, VrstaPica vrstaPica) {
        super(nalepnica, cenaBezKaucija, zapremina, vrstaPica);
       this.setCenaSaKaucijom(cenaBezKaucija);
    }


    @Override
    public String toString() {
        return "Flasa" +
                "nalepnica=" + getNalepnica() +
                ", cenaBezKaucija=" + getCenaBezKaucija() +
                ", zapremina=" + getZapremina() +
                ", vrstaPica=" + getVrstaPica() +
                "vrsta ambalaze: plasticna";
    }
}

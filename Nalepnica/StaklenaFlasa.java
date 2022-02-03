package Nalepnica;

public class StaklenaFlasa extends Flasa{


    public StaklenaFlasa(Nalepnica nalepnica, double cenaBezKaucija, double zapremina,VrstaPica vrstaPica) {
        super(nalepnica, cenaBezKaucija, zapremina, vrstaPica);
       if(zapremina < 0.5){
           this.setCenaSaKaucijom(cenaBezKaucija + cenaBezKaucija * 0.05);
       }else{
           this.setCenaSaKaucijom(cenaBezKaucija + cenaBezKaucija * 0.1);
       }
    }

    @Override
    public String toString() {
        return "Flasa" +
                "nalepnica=" + getNalepnica() +
                ", cenaBezKaucija=" + getCenaBezKaucija() +
                ", zapremina=" + getZapremina() +
                ", vrstaPica=" + getVrstaPica() +
                 "vrsta ambalaze: staklena";
    }
}

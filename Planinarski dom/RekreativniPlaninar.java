public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maximalniUspon;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme,String nazivOkruga, int maximalniUspon) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maximalniUspon = maximalniUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaximalniUspon() {
        return maximalniUspon;
    }

    public void setMaximalniUspon(int maximalniUspon) {
        this.maximalniUspon = maximalniUspon;
    }

    @Override
    public double clanarinaPlaninara() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(this.maximalniUspon - (50 * this.tezinaOpreme) > p.getVisina()){
            setBrojPoena(getBrojPoena() + 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "Rekreativni planinar: " + super.toString() + " , tezina opreme: " + tezinaOpreme + " , naziv okruga: " +
                nazivOkruga + " , maksimalan uspon: " + maximalniUspon;
    }
}

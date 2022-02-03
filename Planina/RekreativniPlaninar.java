package Planina;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private double maximalanUspon;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme, String nazivOkruga, double maximalanUspon) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maximalanUspon = maximalanUspon;

    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: " + getId() + "\n"  + "Ime: " + getIme() + "\n"  + "Prezime: "
                + getPrezime() + "\n"  + "OKrug: " + nazivOkruga);
    }

    @Override
    public double clanarinaPlaninara() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
      double najveciUspon = maximalanUspon - (50 * tezinaOpreme);
        if(p.getVisinaPlanine() > najveciUspon) return true;
        else return false;
    }


}

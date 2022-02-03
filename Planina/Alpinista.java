package Planina;

public class Alpinista extends Planinar{
    private int brojOstvarenihPoenaAlpiniste;


    public Alpinista(int id, String ime, String prezime,int brojOstvarenihPoenaAlpiniste) {
        super(id, ime, prezime);
        this.brojOstvarenihPoenaAlpiniste = brojOstvarenihPoenaAlpiniste;
    }

    public void setBrojOstvarenihPoenaAlpiniste(int brojOstvarenihPoenaAlpiniste) {
        this.brojOstvarenihPoenaAlpiniste = brojOstvarenihPoenaAlpiniste;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista,id: " + getId() + "\n"  + "Ime: " + getIme() + "\n"  +
                "Prezime: " + getPrezime() + "\n"  + "Broj poena: " + brojOstvarenihPoenaAlpiniste);
    }

    @Override
    public double clanarinaPlaninara() {
        double clanarina = 1500 - (50 * brojOstvarenihPoenaAlpiniste);
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if( p.getVisinaPlanine() <= 4000) return true;
        else return false;
    }
}

public class Alpinista extends Planinar{

    public Alpinista(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public double clanarinaPlaninara() {
        double clanarina = 1500 - (getBrojPoena() * 0.05 * 1500);
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(p.getVisina() <= 4000){
            setBrojPoena(getBrojPoena() + 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n" + "Alpinista: " + super.toString();
    }
}

package Atleticar;

public class Trkac extends Atleticar{


    public Trkac(String ime, String prezime, double rezultat) {
        super(ime, prezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiRezultat(Atleticar acko) {
        if(this.getRezultat() < acko.getRezultat()) return true;
        else return false;
    }


}

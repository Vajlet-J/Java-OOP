package Atleticar;

public class Skakac extends Atleticar{


    public Skakac(String ime, String prezime, double rezultat) {
        super(ime, prezime, rezultat);
    }

    @Override
    public boolean daLiJeBoljiRezultat(Atleticar acko) {
        return this.getRezultat() > acko.getRezultat();
    }


}

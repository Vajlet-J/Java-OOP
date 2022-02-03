package Pozoriste;

public class Reditelj extends Zaposleni{
    private String nadimak;

    public Reditelj(String imeIPrezime, Pozoriste pozoristeZaposlenog, String nadimak) {
        super(imeIPrezime, pozoristeZaposlenog);
        this.nadimak = nadimak;
    }

    @Override
    public String toString(){
        return super.toString() + nadimak + " [" + getPozoristeZaposlenog().getNaziv() + "] ";
    }

}

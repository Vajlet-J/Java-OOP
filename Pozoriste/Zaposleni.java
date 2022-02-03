package Pozoriste;

public class Zaposleni {
    private String imeIPrezime;
    private Pozoriste pozoristeZaposlenog;

    public Zaposleni(String imeIPrezime, Pozoriste pozoristeZaposlenog) {
        this.imeIPrezime = imeIPrezime;
        this.pozoristeZaposlenog = pozoristeZaposlenog;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Pozoriste getPozoristeZaposlenog() {
        return pozoristeZaposlenog;
    }

    @Override
    public String toString() {
        return "\n" + imeIPrezime + " [" + pozoristeZaposlenog.getNaziv() + "] ";
    }
}

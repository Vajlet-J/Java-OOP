package Pozoriste;

public class Glumac extends Zaposleni{
    private String nazivUloge;

    public Glumac(String imeIPrezime, Pozoriste pozoristeZaposlenog, String nazivUloge) {
        super(imeIPrezime, pozoristeZaposlenog);
        this.nazivUloge = nazivUloge;
    }

    public String getNazivUloge() {
        return nazivUloge;
    }

    public void setNazivUloge(String nazivUloge) {
        this.nazivUloge = nazivUloge;
    }

    @Override
    public String toString(){
        return super.toString() +  nazivUloge + " [" + getPozoristeZaposlenog().getNaziv() + "] ";

    }



}

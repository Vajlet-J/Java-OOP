package Telefonija;

public class Poruka extends Usluga {
    private String textPoruke;


    public Poruka(Broj brojOd, Broj brojKa, String textPoruke) {
        super(brojOd, brojKa);
        this.textPoruke = textPoruke;
    }

    public String getTextPoruke() {
        return textPoruke;
    }

    public void setTextPoruke(String textPoruke) {
        this.textPoruke = textPoruke;
    }

    @Override
    public double cenaUsluge() {
        if (getBrojOd() != null && getBrojKa() != null && !getBrojOd().equals(getBrojKa())
                && !getBrojKa().isFiksniBroj() && !getBrojOd().isFiksniBroj()) {
            return 3.0;
        } else {
            return 0.0;
        }
    }

        @Override
        public String toString () {
            return super.toString() + " " + textPoruke;
        }
    }

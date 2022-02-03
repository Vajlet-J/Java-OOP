package Telefonija;

import java.util.Objects;

public class Broj {
    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) {
        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj = fiksniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Broj broj1 = (Broj) o;
        return fiksniBroj == broj1.fiksniBroj && Objects.equals(kodDrzave, broj1.kodDrzave) && Objects.equals(pozivniBroj, broj1.pozivniBroj)
                && Objects.equals(broj, broj1.broj);
    }

    @Override
    public String toString() {
        return "Broj{" + kodDrzave +'\''+ pozivniBroj +'\''+ broj + '}';
    }
}

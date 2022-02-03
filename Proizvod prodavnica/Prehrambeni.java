package Domaci;

import java.time.LocalDate;

public class Prehrambeni extends Proizvod {
    LocalDate datumIsteka;

    public Prehrambeni(int barKod, String naziv, double cena) {
        super(barKod, naziv, cena);
    }
}

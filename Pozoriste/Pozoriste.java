package Pozoriste;

import java.util.concurrent.atomic.AtomicInteger;

public class Pozoriste {
    private int identifikator;
    public static final AtomicInteger count = new AtomicInteger(0);
    private String naziv;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
        this.identifikator = count.incrementAndGet();
    }

    public int getIdentifikator() {
        return identifikator;
    }

    public String getNaziv() {
        return naziv;
    }

    @Override
    public String toString() {
        return  naziv + " [" + identifikator + "] " ;
    }
}

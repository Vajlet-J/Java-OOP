package Nalepnica;

import java.util.concurrent.atomic.AtomicInteger;

public class Nalepnica {
    private String naziv;
    private int identifikator;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Nalepnica(String naziv) {
        this.naziv = naziv;
        this.identifikator = count.incrementAndGet();
    }

    public String getNaziv() {
        return naziv;
    }

    public int getIdentifikator() {
        return identifikator;
    }

    @Override
    public String toString() {
        return "Nalepnica{" +
                "naziv='" + naziv + '\'' +
                ", identifikator=" + identifikator +
                '}';
    }
}

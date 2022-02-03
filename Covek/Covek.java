package Covek;

import java.util.concurrent.atomic.AtomicInteger;

public class Covek {
    private String ime;
    private String prezime;
    private int identifikator;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.identifikator = count.incrementAndGet();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getIdentifikator() {
        return identifikator;
    }

    @Override
    public String toString() {
        return "Covek{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", identifikator=" + identifikator +
                '}';
    }
}

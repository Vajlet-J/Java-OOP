import java.util.concurrent.atomic.AtomicInteger;

public abstract class Planinar implements Comparable<Planinar>{
    private int id;
    private String ime;
    private String prezime;
    private int brojPoena;

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.brojPoena = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public abstract double clanarinaPlaninara();

    public abstract boolean uspesanUspon(Planina p);

    @Override
    public int compareTo(Planinar p){
       return (p.getBrojPoena() - getBrojPoena());
    }

    @Override
    public String toString() {
        return "\n" + ime + " " + prezime + ", id: " + id + ", broj poena: " + brojPoena;
    }
}

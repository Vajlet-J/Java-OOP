import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class PlaninarskiDom {
    private String naziv;
    private int godinaOsnivanja;
    private ArrayList<Planinar> listaPlaninara;

    public PlaninarskiDom(String naziv, int godinaOsnivanja, ArrayList<Planinar> listaPlaninara) {
        this.naziv = naziv;
        this.godinaOsnivanja = godinaOsnivanja;
        this.listaPlaninara = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public ArrayList<Planinar> getListaPlaninara() {
        return listaPlaninara;
    }

    public void setListaPlaninara(ArrayList<Planinar> listaPlaninara) {
        this.listaPlaninara = listaPlaninara;
    }

    public void uclaniPlaninara(Planinar p){
        listaPlaninara.add(p);
    }

    public int uspesnoPopetiPlaninari (Planina p){
    int brojPopetihPlaninara = 0;
    for (Planinar e : listaPlaninara){
       if(e.uspesanUspon(p)){
           brojPopetihPlaninara ++ ;
       }
    }
    return brojPopetihPlaninara;
    }

    public void izbaciPlaninara(Planinar p){
        listaPlaninara.remove(p);
    }

    @Override
    public String toString() {
        return "Planinarski dom: " + naziv + "\n" +
                ", godinaOsnivanja: " + godinaOsnivanja + "\n" +
                ", listaPlaninara:" + "\n" + listaPlaninara.toString();
    }

    public double sumaClanarina(){
     double sumaClanarina = 0;
        for(Planinar p : listaPlaninara){
         sumaClanarina += p.clanarinaPlaninara();
     }
     return sumaClanarina;
    }

    public void sortirajPlaninare(){
        Collections.sort(listaPlaninara);
    }

}

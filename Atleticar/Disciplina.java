package Atleticar;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;
    private List<Atleticar> nizAtleticara;

    public Disciplina(String ime, String tipDiscipline) {
        this.imeDiscipline = ime;
        this.tipDiscipline = tipDiscipline;
        this.nizAtleticara = new ArrayList<>();
    }

    public String getIme() {
        return imeDiscipline;
    }

    public void setIme(String ime) {
        this.imeDiscipline = ime;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public void dodajAtleticara(Atleticar aca){
        nizAtleticara.add(aca);
    }
    public void diskvalifikacija(String ime, String prezime){
        for(Atleticar atleticar : nizAtleticara){
            if(ime.equals(atleticar.getIme()) && prezime.equals(atleticar.getPrezime())){
            nizAtleticara.remove(atleticar);
            }
        }
    }

    private Atleticar najboljiAtleticar (){
       Atleticar najbolji = nizAtleticara.get(0);
       for (Atleticar elementNiza : nizAtleticara){
           if(elementNiza.daLiJeBoljiRezultat(najbolji)){
               najbolji = elementNiza;
           }
       }
       return najbolji;
    }

    public void pobednik(){
        System.out.println(najboljiAtleticar());
    }


}

package VideoPlayer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VideoPlayer pokemon = new VideoPlayer(1050,500,20);
        ArrayList<Control> kontrole = new ArrayList<>();
        kontrole.add(new TimeControl(true));
        kontrole.add(new AudioControl(true));
        kontrole.add(new QualityOptimizerControl(20));

        izvrsiKontroluBrojPuta(kontrole,5, new AudioControl(true));

        for (Control c : kontrole){
            c.izvrsiAkciju(pokemon);
        }


//        Control premotaj = new TimeControl(true);
//        premotaj.izvrsiAkciju(pokemon);
//        pokemon.stampaj();

        }
    public static void izvrsiKontroluBrojPuta(ArrayList<Control> a, int b, Control c){
        for(int i = 0; i < b ; i++){
            a.add(c);
        }
    }

}

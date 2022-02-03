package Telefonija;

public class Poziv extends Usluga {

    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }


    @Override
    public String toString() {
        return super.toString() + " " + trajanjeUSekundama / 60 + ":" + trajanjeUSekundama % 60;
    }

    @Override
    public double cenaUsluge() {
        double minut = 0;
        if (getBrojOd() != null && getBrojKa() != null && !getBrojOd().equals(getBrojKa())) {
            if (trajanjeUSekundama % 60 == 0) {
                return trajanjeUSekundama / 60 * 10;
            } else {
                return (trajanjeUSekundama / 60 + 1) * 10;
            }
        }
        return 0;
    }









    //
//    @Override
//    public double cenaUsluge() {
//        double minut = 0;
//        if(getBrojOd() != null && getBrojKa() != null && !getBrojOd().equals(getBrojKa())){
//            minut = trajanjeUSekundama/60;
//           return Math.ceil(minut) * 10;
//        }else {
//            return 0;
//        }
//    }
}

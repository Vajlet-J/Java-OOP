package Atleticar;

public class Main {
    public static void main(String[] args) {
        Disciplina stoMetaraSPreponama = new Disciplina("Trka na 100","Trkacka");
        Disciplina skokUDalj = new Disciplina("Skok u dalj","Skakacka");

        Skakac s1 = new Skakac("Milan","Milovanovic",3.1);
        Skakac s2 = new Skakac("Jovan","Milovanov",4.0);
        Skakac s3 = new Skakac("Marko","Milovic",2.5);

        Trkac t1 = new Trkac("Danijela","Rajovic",9.5);
//        Trkac t2 = new Trkac("Marija","Rajic",10.0);
        Trkac t3 = new Trkac("Makica","Rokic",5.5);

        stoMetaraSPreponama.dodajAtleticara(new Trkac("Marija","Rajic",10.0));
        stoMetaraSPreponama.dodajAtleticara(t1);
        stoMetaraSPreponama.dodajAtleticara(t3);

        stoMetaraSPreponama.pobednik();

        skokUDalj.dodajAtleticara(s1);
        skokUDalj.dodajAtleticara(s2);
        skokUDalj.dodajAtleticara(s3);

        skokUDalj.pobednik();
    }
}

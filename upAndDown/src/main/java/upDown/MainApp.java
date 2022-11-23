package upDown;

public class MainApp {
    public static void main(String[] args) {
        //###UpCasting

        Persona p = new Studente("Mattia","Cutaia",28,"A1111");
        p.stampa();
        // p.getMatricola();     ----- non funziiona ----
        //downcasting per riottenere i metodi (100% sicuro)
        Studente s = (Studente) p;  // casting in upDown.Studente ( da padre a figlio)
        System.out.println(s.getMatricola());// funziona;


        // -----------------------------------------------------------------

        //###DownCasting

        // upDown.Studente ss = (upDown.Studente) new upDown.Persona("Paolo","Rossi", 33);
        // System.out.println(ss.getMatricola()); // Exception ClassCastException
        // ss.setMatricola("A222222");
        // System.out.println(ss.getMatricola());  // Exception ClassCastException



    }
}

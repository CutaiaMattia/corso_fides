package upDown;

public class Studente extends Persona {

    String matricola;


    public Studente(String nome, String cognome, int eta, String matricola) {
        super(nome, cognome, eta);
        this.matricola = matricola;
    }


    public void stampa(String matricola) {
        super.stampa();
        System.out.printf("matricola : %s",matricola);
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
}

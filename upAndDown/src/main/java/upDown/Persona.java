package upDown;

public class Persona {

    String nome;
    String cognome;
    int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void stampa(){
        System.out.printf("nome : %s \ncognome : %s\neta : %s\n",nome,cognome,eta);
    }
}

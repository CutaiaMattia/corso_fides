

public class Persona implements Comparable<Persona> {
    private String nome;
    private String cognome;
    private int eta;

    public Persona() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public int compareTo(Persona o) {
        if (o.getEta() < this.eta) {
            return -1;
        } else if (o.getEta() > this.eta) {
            return 1;
        } else
            return 0;
    }

}

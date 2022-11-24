public abstract class Player {
    private String nome;


    private int attacco = 10;
    private int difesa = 10;
    private int magia = 0;

    public int getAttacco() {
        return attacco;
    }

    public void setAttacco(int attacco) {
        this.attacco = attacco;
    }

    public int getDifesa() {
        return difesa;
    }

    public void setDifesa(int difesa) {
        this.difesa = difesa;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public Player(String nome) {
        this.nome = nome;
        this.attacco = attacco;
        this.difesa = difesa;
        this.magia = magia;
    }

    public abstract void attacco();
}

public class Warrior extends Player{
    private int initAttacco = 30;

    public Warrior(String nome) {
        super(nome);
        super.setAttacco(initAttacco);
    }

    @Override
    public void attacco() {
        System.out.println("il guerriero attacca con spada e' fa "+ getAttacco());
    }
}

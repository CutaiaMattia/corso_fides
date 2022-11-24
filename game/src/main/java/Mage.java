public class Mage extends Player{
    private int initMagic = 50;

    public Mage(String nome) {
        super(nome);
        super.setMagia(initMagic);
    }

    @Override
    public void attacco() {
        System.out.println("il mago attacca con pioggia di meteore e' fa "+ getMagia());
    }
}

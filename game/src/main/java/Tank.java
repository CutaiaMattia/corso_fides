public class Tank extends Player{
    private int initDifesa = 40;

    public Tank(String nome) {
        super(nome);
        super.setDifesa(initDifesa);
    }

    @Override
    public void attacco() {
        System.out.println("il tank difende con scudo ed ha " + getDifesa() + " punti in difesa");
    }
}

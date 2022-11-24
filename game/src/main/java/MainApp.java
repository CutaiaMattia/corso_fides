public class MainApp {

    public static void main(String[] args) {
        Player mago = new Mage("Eudora");
        Player guerriero = new Warrior("Alucard");
        Player tank = new Tank("Tigreal");
        mago.attacco();
        guerriero.attacco();
        tank.attacco();

    }
}

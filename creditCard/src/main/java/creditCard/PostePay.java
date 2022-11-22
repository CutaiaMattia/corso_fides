package creditCard;

public class PostePay extends CreditCard{
    private final String iban;

    public String getIban() {
        return iban;
    }

    public PostePay(String name, String surname, String expiring, double balance, String iban) {
        super(name, surname, expiring, balance);
        this.iban = iban;

    }

    @Override
    public void stampaDati() {
        System.out.println(" --------- Poste Pay ---------");
        super.stampaDati();
        System.out.printf(" iban : %s \n",getIban());
    }
}


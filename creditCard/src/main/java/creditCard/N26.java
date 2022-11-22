package creditCard;

public class N26 extends CreditCard {

    public String getIban() {
        return iban;
    }

    public String getCode() {
        return code;
    }

    private final String iban;
    private final String code;


    public N26(String name, String surname, String expiring, double balance,String iban,String code) {
        super(name, surname, expiring, balance);
        this.iban = iban;
        this.code = code;
    }

    @Override
    public void stampaDati() {
        System.out.println(" --------- N26 ---------");
        super.stampaDati();
        System.out.printf(" iban : %s \n",getIban());
    }
}

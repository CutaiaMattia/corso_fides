package creditCard;


import creditCard.exceptions.WithdrawalDeniedException;

import java.util.Random;

public class CreditCard {


    private final String name;
    private final String surname;
    private int[] numCard = new int[16];
    private int[] cvv = new int[3];
    private String expiring;
    private double balance;

    public CreditCard(String name, String surname, String expiring, double balance) {
        this.name = name;
        this.surname = surname;
        this.numCard = new int[16];
        this.cvv = new int[3];
        this.expiring = expiring;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int[] getNumCard() {
        return numCard;
    }

    public double getBalance() {
        return balance;
    }

    private void setExpiring(String expiring) {
        this.expiring = expiring;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }


    public void stampaDati() {
        generateNumCard();
        generateCvv();
        System.out.printf("                 Proprietario \n nome : %s \n cognome : %s \n numero carta : %s \n", getName(), getSurname(), displayNumCard(numCard));
    }

    public void generateNumCard() {
        Random random = new Random();
        for (int i = 0; i < numCard.length; i++) {
            numCard[i] = random.nextInt(9);

        }
    }

    public String displayNumCard(int[] numCard) {
        String displayCard = "";
        for (int num : numCard) {
            displayCard += num;
        }
        return displayCard;
    }

    public void generateCvv() {
        Random random = new Random();
        for (int i = 0; i < cvv.length; i++) {
            this.cvv[i] = random.nextInt(3);
        }
    }

    public String displayCvv(int[] cvv) {
        String displayCvv = "";
        for (int num : cvv) {
            displayCvv += num;
        }
        return displayCvv;
    }

    public double withdrawal(double withdrawal) throws WithdrawalDeniedException {

        if (getBalance() < withdrawal) {
            throw new WithdrawalDeniedException();
        } else {
            setBalance(getBalance() - withdrawal);
        }
        return balance;
    }

    public double depositMoney(double insertMoney) {
        setBalance(getBalance() + insertMoney);
        return balance;
    }

}


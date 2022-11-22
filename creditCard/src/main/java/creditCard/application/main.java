package creditCard.application;

import creditCard.CreditCard;
import creditCard.N26;
import creditCard.PostePay;
import creditCard.exceptions.WithdrawalDeniedException;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N26 n26 = new N26("Paolo", "Rossi", "10/02/30", 100, "IT1111111", "2211");
        n26.stampaDati();
        System.out.println(" \ndeposit your money :  ");
        n26.depositMoney(sc.nextDouble());
        System.out.println("\n balance :  " + n26.getBalance() + "\n");

        System.out.println("\nwithdrawal :  ");
        try {
            n26.withdrawal(sc.nextDouble());
        } catch (WithdrawalDeniedException e) {

        }
        System.out.println("\n balance :  " + n26.getBalance() + "\n");

        PostePay pp = new PostePay("Anna", "Neri", "10/02/30", 100, "IT2222222");
        pp.stampaDati();

        System.out.println("\ndeposit your money :  ");
        pp.depositMoney(sc.nextDouble());
        System.out.println("\n balance :  " + pp.getBalance() + "\n");
        System.out.println("\nwithdrawal :  ");
        try {
            pp.withdrawal(sc.nextDouble());
        } catch (WithdrawalDeniedException e){

        }
        System.out.println("\n balance :  " + pp.getBalance() + "\n");


    }
}

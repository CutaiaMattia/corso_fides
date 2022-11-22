package creditCard.exceptions;

public class WithdrawalDeniedException extends Exception {
    public WithdrawalDeniedException() {
        System.out.println("not enough money!");
    }
}

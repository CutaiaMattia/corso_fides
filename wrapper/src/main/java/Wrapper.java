import java.util.Scanner;

public class Wrapper {

    public static void main(String[] args) {
        Integer n = new Integer(12);       //boxing
        Integer nn = n.intValue();               //unboxing
        int nnn = nn;                            //autoboxing
        int nnnn = 54;                           //autoboxing


        String password = "";
        Scanner pwdIn = new Scanner(System.in);
        password = pwdIn.nextLine();
        boolean upperFound = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                upperFound = true;
            }
        }
        if (upperFound){
            System.out.println("password correttamente formattata");
        } else {
            System.out.println("password sbagliata, inserire una carattere maiuscolo");
        }


    }
}

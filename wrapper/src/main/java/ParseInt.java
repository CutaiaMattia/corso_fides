public class ParseInt {

    public static void main(String[] args) {
        String input = "1234";
        int pos = input.length() - 1;
        int risultato = 0;
        for (int i = 0; i < input.length(); i++) {
            int num = input.charAt(i) - 48;
            risultato += num * Math.pow(10,pos);
            pos--;
        }
        System.out.println(risultato);


    }
}

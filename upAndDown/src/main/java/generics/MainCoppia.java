package generics;

public class MainCoppia {
    public static void main(String[] args) {
        Coppia<Integer> cNum = new Coppia<>(1,2);
        System.out.println(cNum.getA());
        System.out.println(cNum.getB());

        Coppia<String> cStr = new Coppia<>("ciao","mondo");
        System.out.println(cStr.getA());
        System.out.println(cStr.getB());
    }




}

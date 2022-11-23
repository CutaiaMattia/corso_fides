package db;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Garage g = new Garage();
        switch (input) {
            case "show": {
                g.showGarage();
                break;
            }
            case "insert" : {
                System.out.println("plate");
                String plate = in.nextLine();
                System.out.println("type");
                String type = in.nextLine();
                System.out.println("producer");
                String producer = in.nextLine();
                g.insertCar(plate,type,producer);
                break;
            }
        }

    }
}

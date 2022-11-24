package db;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isClose = false;
        while (!isClose) {
            System.out.println("what do you want to do ? [Show / insert / delete / update / stop]");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine().toLowerCase();
            Garage g = new Garage();
            switch (input.trim()) {
                case "show": {
                    g.showGarage();
                    System.out.println();
                    break;
                }
                case "insert": {
                    System.out.println("insert : ");
                    System.out.println("plate ");
                    String plate = in.nextLine();
                    System.out.println("type ");
                    String type = in.nextLine();
                    System.out.println("producer ");
                    String producer = in.nextLine();
                    g.insertCar(plate, type, producer);
                    System.out.println();
                    break;
                }

                case "delete": {
                    System.out.println("insert plate to delete");
                    String plate = in.nextLine();
                    g.delete(plate);
                    System.out.println();
                    break;
                }

                case "update": {
                    System.out.println("insert : ");
                    System.out.println("column to update ");
                    String column = in.nextLine().toLowerCase();
                    System.out.println("value ");
                    String value = in.nextLine();
                    System.out.println("plate to update ");
                    String plate = in.nextLine();
                    g.upDateCar(column, value, plate);
                    System.out.println();
                    break;
                }
                case "stop": {
                    isClose = true;
                }
                default:
                    System.out.println("Show / insert / delete / update / stop");
                    break;
            }
        }
    }
}

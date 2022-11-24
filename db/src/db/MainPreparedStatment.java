package db;


import java.util.Scanner;

public class MainPreparedStatment {


    /*
    importare i jconnector = file -> project structure ->libraries ---> aggiungi-> (ricercare il mysql-connector.jar)
     */

    public static void main(String[] args) {
        boolean isClose = false;
        while (!isClose) {
            System.out.println("what do you want to do ? [Show / insert / delete / update / stop]");
            Scanner in = new Scanner(System.in);
            String input = in.nextLine().toLowerCase();
            GaragePreparedStantment g = new GaragePreparedStantment();
            switch (input.trim()) {
                case "show": {
                    System.out.println("column ");
                    String column = in.nextLine();
                    if(!column.equalsIgnoreCase("*")){
                        System.out.println("plate ");
                        String plate = in.nextLine();

                        g.showGarage(column,plate);
                    } else {
                        g.showGarage(column,"");
                    }

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

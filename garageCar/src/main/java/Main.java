import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner fileIn = null;
        try {
            fileIn = new Scanner(new File("car.csv"));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        Garage garage = new Garage();
        int countaCar = 0;

        while (fileIn.hasNextLine()) {
            String plate = "";
            String producer = "";
            String type = "";
            String carDetected = "";
            carDetected = fileIn.nextLine();
            String[] stringSplit = carDetected.split(";");
            for (int i = 0; i < stringSplit.length; i++) {
                String[] value = stringSplit[i].split("=");
                switch (value[0]) {
                    case "plate": {
                        plate = value[1];
                        break;
                    }
                    case "producer": {
                        producer = value[1];
                        break;
                    }
                    case "type": {
                        type = value[1];
                        break;
                    }
                }
            }
            Car car = new Car(plate, producer, type);
            garage.addCar(car, countaCar);
            countaCar++;

        }


        PrintWriter fileOut = null;
        try {
            fileOut = new PrintWriter(new FileOutputStream("garage.csv", true));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        for (int i = 0; i < garage.getGarageCar().length - 1; i++) {
            if (garage.getGarageCar()[i] != null) {
                fileOut.printf("plate=%s;producer=%s;type=%s;\n",
                        garage.getGarageCar()[i].getPlate(),
                        garage.getGarageCar()[i].getProducer(),
                        garage.getGarageCar()[i].getType());
            }
        }
        fileOut.close();
        garage.showGarage();
    }

}

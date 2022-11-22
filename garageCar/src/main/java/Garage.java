import java.util.ArrayList;

public class Garage {


    private Car[] garageCar = new Car[10];

    public Garage() {
    }

    public Car[] getGarageCar() {
        return garageCar;
    }

    public void addCar(Car car,int i){
        garageCar[i] = car;

    }
    public void showGarage(){
        for (int i = 0; i< getGarageCar().length-1; i++){
            if(garageCar[i] != null)
            System.out.printf("%s    %s    %s   \n",
                    garageCar[i].getPlate(),garageCar[i].getProducer(),garageCar[i].getType());

        }
    }
}

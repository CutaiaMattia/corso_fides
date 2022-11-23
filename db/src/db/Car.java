package db;

public class Car {

    String plate;
    String producer;
    String type;

    public Car(String plate, String producer, String type) {
        this.plate = plate;
        this.producer = producer;
        this.type = type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

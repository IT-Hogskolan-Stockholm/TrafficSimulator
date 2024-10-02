public class Car implements Vehicle {
    String carPlateNumber;
    private String color;

    Car(String carPlateNumber, String color) {
        this.carPlateNumber = carPlateNumber;
        this.color = color;
    };

    public Car(String color) {
        this.color = color;
    }
    @Override
    public void move(Road road, TrafficRule rule) {

    }

    @Override
    public String getType() {
        return carPlateNumber;
    }

    public String getColor() {
        return color;
    }
}

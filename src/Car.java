public class Car implements Vehicle {
    String carPlateNumber;

    Car(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    };
    @Override
    public void move(Road road, TrafficRule rule) {

    }

    @Override
    public String getType() {
        return carPlateNumber;
    }
}

public class Bus implements Vehicle {
    final private String type = "Bus";

    @Override
    public void move(Road road, TrafficRule rule) {

    }

    @Override
    public String getType() {
        return type;
    }
}

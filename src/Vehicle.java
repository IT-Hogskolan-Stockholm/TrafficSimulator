/**
 * The Vehicle interface represents a vehicle in the traffic simulation.
 * It provides methods to move the vehicle and retrieve its type.
 */
public interface Vehicle {
    void move(Road road, TrafficRule rule);
    String getType();
}

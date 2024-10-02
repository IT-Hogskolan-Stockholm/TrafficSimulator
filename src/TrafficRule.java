/**
 * The TrafficRule interface defines the contract for traffic rules that can be applied to vehicles.
 * Implementations of this interface will determine whether a vehicle can move and apply specific rules to the vehicle.
 */
public interface TrafficRule {
    boolean canMove(Vehicle vehicle);
    void applyRule(Vehicle vehicle);
}

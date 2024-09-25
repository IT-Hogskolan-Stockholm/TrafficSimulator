public interface TrafficRule {
    boolean canMove(Vehicle vehicle);
    void applyRule(Vehicle vehicle);
}

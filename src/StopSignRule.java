public class StopSignRule implements TrafficRule {
    @Override
    public boolean canMove(Vehicle vehicle) {
        return false;
    }

    @Override
    public void applyRule(Vehicle vehicle) {

    }
}

/**
 * The Main class serves as the entry point for the Traffic Simulator application.
 * It initializes a TrafficSimulator instance and starts the traffic simulation.
 */
public class Main {
    public static void main(String[] args) {
        TrafficSimulator simulator = new TrafficSimulator();
        simulator.simulateTraffic();
    }
}

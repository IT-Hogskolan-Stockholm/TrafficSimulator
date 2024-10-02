/**
 * The TrafficSimulator class simulates traffic on various roads with different vehicles and traffic rules.
 * It generates a random setup of roads, vehicles, and traffic rules, and then simulates the traffic.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrafficSimulator {
    private List<Vehicle> vehicles;
    private List<Road> roads;
    private List<TrafficRule> trafficRules;

    public TrafficSimulator() {
        vehicles = new ArrayList<>();
        roads = new ArrayList<>();
        trafficRules = new ArrayList<>();
        generateRandomSetup();
    }

    public void generateRandomSetup() {
        for (int i = 0; i < 5; i++) {
            roads.add(generateRandomRoad());
            trafficRules.add(generateRandomTrafficRule());
        }

        for (int i = 0; i < 5; i++) {
            vehicles.add(generateRandomVehicle());
        }
    }

    private Road generateRandomRoad() {
        Road[] roadTypes = {new Highway(), new CityStreet()};
        return roadTypes[new Random().nextInt(roadTypes.length)];
    }

    private TrafficRule generateRandomTrafficRule() {
        TrafficRule[] rules = {new TrafficLightRule(), new StopSignRule()};
        return rules[new Random().nextInt(rules.length)];
    }

    private Vehicle generateRandomVehicle() {
        Vehicle[] vehicles = {new Car(""), new Bus()};
        return vehicles[new Random().nextInt(vehicles.length)];
    }

    public void simulateTraffic() {
        System.out.println("---- Simulerar trafik ----");
        for (int i = 0; i < roads.size(); i++) {
            Road road = roads.get(i);
            TrafficRule rule = trafficRules.get(i);

            for (Vehicle vehicle : vehicles) {
                vehicle.move(road, rule);
            }
        }
    }
}

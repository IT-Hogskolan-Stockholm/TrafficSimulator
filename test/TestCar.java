import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    @Test
    getTypeTest(){
        Car car = new Car();
        assertEquals(car.getType(), "Car");
    }
}

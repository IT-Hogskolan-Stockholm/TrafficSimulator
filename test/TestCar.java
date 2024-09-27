import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCar {
    @Test
    void getTypeTest(){
        Car car = new Car("AbC457");
        assertEquals(car.getType(), "Car");
    }
}

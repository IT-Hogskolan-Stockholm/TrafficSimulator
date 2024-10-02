import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    void lookMain() {
        Car myCar = new Car("NAs1234");
        assertEquals("NAS1234", myCar.getType());
    }
}

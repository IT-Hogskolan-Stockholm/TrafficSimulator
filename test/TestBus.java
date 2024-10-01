import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBus {

    @Test
    public void testBusType() {
        Bus bus = new Bus();
        assertEquals("Bus", bus.getType());
    }
}

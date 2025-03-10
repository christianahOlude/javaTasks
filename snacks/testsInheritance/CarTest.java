import inheritance.Car;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void carTest(){
        Car car = new Car();
        assertEquals("Repairing a car",car.drive());
    }

}
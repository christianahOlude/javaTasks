import Abstraction.Lion;
import Abstraction.Tiger;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TigerTest {
    @Test
    public void makeSound() {
        Tiger tiger = new Tiger();
        assertEquals("Makes sound",tiger.sound());
    }

    @Test
    public void makeSound2() {
        Lion lion = new Lion();
        assertEquals("Roars",lion.sound());
    }

}
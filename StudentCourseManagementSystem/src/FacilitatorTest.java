import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacilitatorTest {
    @Test
    public void testFacilitatorCanRegister() {
        Facilitator facilitator = new Facilitator("name","password","olude@gmail.com");
        assertEquals("name",facilitator.register("name","password","olude@gmail.com"));
    }
    @Test
    public void testFacilitator_can_login() {
        Facilitator facilitator = new Facilitator("name","password","olude@gmail.com");
        assertEquals("name",facilitator.login("name","password","olude@gmail.com"));
    }

    @Test
    public void testFacilitator_can_create_course() {
        Facilitator facilitator = new Facilitator("name","password","olude@gmail.com");
        assertEquals("name",facilitator.login("name","password","olude@gmail.com"));

        facilitator.createCourses();
    }
}
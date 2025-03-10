import inheritance.HRManager;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HRManagerTest {
    @Test
    public void testHRManager(){
        HRManager hrManager = new HRManager();
        assertEquals("HR Work",hrManager.work());
    }

}
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() { waterBottle = new WaterBottle("Water Bottle", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Water Bottle", waterBottle.getName());
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getStartingVolume());
    }
}

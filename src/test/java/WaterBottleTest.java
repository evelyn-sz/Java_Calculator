import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;
    WaterBottle highlandSpring;

    @Before
    public void before() {
        waterBottle = new WaterBottle("Water Bottle", 100);
        highlandSpring = new WaterBottle("Highland Spring", 90);
    }

    @Test
    public void hasName(){
        assertEquals("Water Bottle", waterBottle.getName());
    }

    @Test
    public void volumeStartsAt100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void bottleCanBeDrunkFrom(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void bigBottleCanBeDrunkFrom(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(70, waterBottle.getVolume());
    }

    @Test
    public void canBeEmptied(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canBeRefilled(){
        waterBottle.drink();
        waterBottle.drink();
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}

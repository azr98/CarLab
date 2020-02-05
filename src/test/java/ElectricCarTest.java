import org.junit.Before;
import org.junit.Test;
import parts.GearBox;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar tesla;
    private GearBox gearBox;

    @Before
    public void before(){
        tesla = new ElectricCar("Tesla", "Model X", 70000,"Blue" );
        gearBox = new GearBox("Musk", true, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Tesla",tesla.getMake());
    }

    @Test
    public void canAddPart(){
        tesla.addPart(gearBox);
        assertEquals(tesla.getParts().get(0).getName(), "Musk");
    }

    @Test
    public void damageChangesPrice(){
        tesla.addDamage(10000);
        assertEquals(60000,tesla.getPrice());
    }


}

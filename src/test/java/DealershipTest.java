import org.junit.Before;
import org.junit.Test;
import parts.ElectricEngine;
import parts.HybridEngine;
import parts.PetrolEngine;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealer;
    private ElectricCar tesla;
    private HybridCar toyota;

    private ElectricEngine electricEngine;
    private HybridEngine hybridEngine;

    @Before
    public void before(){
        tesla = new ElectricCar("Tesla","Roadster", 280000,"Red");
        toyota = new HybridCar("Toyota", "Prius", 30000, "White");

        electricEngine = new ElectricEngine("Telsa engine", 250, 600);
        hybridEngine = new HybridEngine("Prius engine", 40, 1.2);

        tesla.addPart(electricEngine);
        toyota.addPart(hybridEngine);

        dealer = new Dealership("Arnold Clark", 100000);
        dealer.addStock(tesla);
    }

    @Test
    public void canRemoveFromStock(){
        assertEquals(tesla, dealer.removeCar(tesla));
    }

    @Test
    public void canSellCar(){
        dealer.addMoney(tesla);
        assertEquals(380000,dealer.getTill());
    }

    @Test
    public void canRepairCar(){
        tesla.addDamage(5000);
        dealer.repairCar(tesla);
        assertEquals(0, tesla.getDamage());
        assertEquals(95000, dealer.getTill());
    }



}

import org.junit.Before;
import org.junit.Test;
import parts.ElectricEngine;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ElectricCar tesla;
    private ElectricEngine electricEngine;
    private Dealership dealer;

    @Before
    public void before(){
        customer = new Customer("Azhar",1000000);

        tesla = new ElectricCar("Tesla","Roadster", 280000,"Red");
        electricEngine = new ElectricEngine("Telsa engine", 250, 600);

        tesla.addPart(electricEngine);

        dealer = new Dealership("Arnold Clark", 100000);
        dealer.addStock(tesla);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(tesla,dealer);
        assertEquals(1,customer.getOwnedCars().size());
    }

    @Test
    public void hasPayed(){
        customer.buyCar(tesla,dealer);
        assertEquals(720000,customer.getMoney());
        assertEquals(380000,dealer.getTill());
    }


}

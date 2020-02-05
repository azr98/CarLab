import com.sun.xml.internal.ws.api.pipe.Engine;
import org.junit.Before;
import org.junit.Test;
import parts.Part;
import parts.PetrolEngine;

import static org.junit.Assert.assertEquals;

public class EnigneTest {

    PetrolEngine petrolEngine;

    @Before
    public void before(){
        petrolEngine = new PetrolEngine("James May", 1.6, 200);
    }

    @Test
    public void getHoresePower(){
        assertEquals(200,petrolEngine.getHorsePower());
    }
}

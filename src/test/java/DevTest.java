import org.junit.Before;
import org.junit.Test;
import staff.tech.Dev;

import static org.junit.Assert.assertEquals;

public class DevTest {
    Dev dev;

    @Before
    public void before(){dev = new Dev("Viktor", 324,31.3);}

    @Test
    public void hasName(){assertEquals("Viktor", dev.getName());}

    @Test
    public void hasNi(){assertEquals(324,dev.getNI());}

    @Test
    public void hasSalary(){assertEquals(31.3,dev.getSalary(),0.0);}

    @Test
    public void canRaiseSalary(){
        dev.raiseSalary(0.2);
        assertEquals(37.56, dev.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        dev.payBonus();
        assertEquals(31.613,dev.getSalary(),0.00);
    }
}

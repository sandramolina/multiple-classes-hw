import org.junit.Before;
import org.junit.Test;
import staff.tech.DBAdmin;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {

    DBAdmin dbAdmin;

    @Before
    public void before(){dbAdmin =new DBAdmin("Penelope", 234,100.0);}

    @Test
    public void hasName(){assertEquals("Penelope", dbAdmin.getName());}

    @Test
    public void hasNi(){assertEquals(234,dbAdmin.getNI());}

    @Test
    public void hasSalary(){assertEquals(100.0,dbAdmin.getSalary(),0.0);}

    @Test
    public void canRaiseSalary(){
        dbAdmin.raiseSalary(0.9);
        assertEquals(190.0, dbAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        dbAdmin.payBonus();
        assertEquals(101.0,dbAdmin.getSalary(),0.00);
    }
}

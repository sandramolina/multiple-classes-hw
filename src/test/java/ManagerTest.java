import org.junit.Before;
import org.junit.Test;
import staff.mgmt.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mateo", 1942, 50.5,"Finance");
    }

    @Test
    public void hasName(){
        assertEquals("Mateo", manager.getName());
    }

    @Test
    public void hasNi(){
        assertEquals(1942, manager.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(50.5, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.2);
        assertEquals(60.59, manager.getSalary(), 0.009999999999994);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(51.005,manager.getSalary(),0.00);
    }

    @Test
    public void canChangeName(){
        manager.setName("Ricardo");
        assertEquals("Ricardo", manager.getName());
    }

    @Test
    public void canNotChangeNameNull(){
        manager.setName(null);
        assertEquals("Mateo", manager.getName());
    }
}

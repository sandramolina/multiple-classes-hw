import org.junit.Before;
import org.junit.Test;
import staff.mgmt.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){director = new Director("Sandra",666,1000.00,"Tech",10000.00);}

    @Test
    public void hasName(){
        assertEquals("Sandra", director.getName());
    }

    @Test
    public void hasNi(){
        assertEquals(666, director.getNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(1000.00, director.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("Tech", director.getDeptName());
    }

    @Test
    public void hasBudget(){assertEquals(10000.00,director.getBudget(),0.00);}

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.2);
        assertEquals(1200.0, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(1020.0,director.getSalary(),0.00);
    }
}

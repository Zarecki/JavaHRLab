package Employee.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBAdTest {

    DBAd dBAd;

    @Before
    public void before(){
        dBAd = new DBAd("Bob Bobsson", "BOB13415", 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob Bobsson", dBAd.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("BOB13415", dBAd.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, dBAd.getSalary(), 0.01);
    }

    @Test
    public void checkRaise(){
        dBAd.raiseSalary(5.1);
        assertEquals(26275.00, dBAd.getSalary(), 0.01);
    }

    @Test
    public void canCheckBonus(){
        assertEquals(250, dBAd.checkBonus(), 0.01);
    }

    @Test
    public void canPayBonus(){
        dBAd.payBonus();
        assertEquals(25250.00, dBAd.getSalary(), 0.01);
    }
}

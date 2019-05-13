package Employee.techStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DevTest {

    Dev dev;

    @Before
    public void before() {
        dev = new Dev("Bob Bobsson", "BOB13415", 25000.00);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob Bobsson", dev.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("BOB13415", dev.getnINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(25000.00, dev.getSalary(), 0.01);
    }

    @Test
    public void checkRaise() {
        dev.raiseSalary(5.1);
        assertEquals(26275.00, dev.getSalary(), 0.01);
    }

    @Test
    public void canCheckBonus() {
        assertEquals(250, dev.checkBonus(), 0.01);
    }

    @Test
    public void canPayBonus() {
        dev.payBonus();
        assertEquals(25250.00, dev.getSalary(), 0.01);
    }

}

package Employee.Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mrs Jon", "JON46457", 32000.00, "Marketing");
    }

    @Test
    public void canGetDept(){
        assertEquals("Marketing", manager.getDeptName());
    }
}

package Employee.Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDirector {

    Director director;

    @Before
    public void before(){
        director = new Director("Cpt Industry", "CPT257", 50000.00, "Business Stuff", 100000.00);
    }

    @Test
    public void getBudget(){
        assertEquals(100000.00, director.getBudget(),0.01);
    }

    @Test
    public void checkBonus(){
        director.payBonus();
        assertEquals(51000.00, director.getSalary(), 0.01);
    }
}

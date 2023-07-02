package technology;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert.*;



 public class ComputerTest extends TestCase {

    Computer test_computer;
    @Before
    public void createComputerInstance() {
         test_computer = new Computer("Macbook Pro", 2022, 2500);
    }
    @Test
    public void testGetCost() {
        assertEquals(2500, test_computer.getCost(), .001);
    }
}
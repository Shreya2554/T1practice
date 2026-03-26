package trail.T1practice;

import org.junit.Test;
import static org.junit.Assert.*;

public class addtest {

    @Test
    public void testforadd() {
        add a = new add();

        assertEquals(7, a.addition(2, 5));
        assertEquals(4, a.addition(2, 2));
    }
}
import junit.framework.TestCase;

public class Factorial2Test extends TestCase {
    public void testFactorial2(){
        Factorial2 factorial2 = new Factorial2();
        assertEquals(21,factorial2.test2(6));

        assertEquals(0,factorial2.test2(0));

        assertEquals(-1,factorial2.test2(-1));

        assertEquals(-1,factorial2.test2(2000000));

        assertEquals(200010000,factorial2.test2(20000));
    }

}
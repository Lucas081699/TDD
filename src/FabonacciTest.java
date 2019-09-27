import junit.framework.TestCase;

public class FabonacciTest extends TestCase {
    public void testFabonacci(){
        Fabonacci fabonacci = new Fabonacci();
        assertEquals(120,fabonacci.test(5));

        assertEquals(1,fabonacci.test(0));

        assertEquals(-1,fabonacci.test(-5));

        assertEquals(-1,fabonacci.test(500000000));

        assertEquals(720,fabonacci.test(6));
    }

}
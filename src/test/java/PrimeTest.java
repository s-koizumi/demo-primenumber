/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    public void testOddNumbers() {
        Prime classUnderTest = new Prime();
        assertTrue(classUnderTest.isPrime(2));
        assertTrue(classUnderTest.isPrime(3));
        assertTrue(classUnderTest.isPrime(5));
        assertFalse(classUnderTest.isPrime(9));
    }
}

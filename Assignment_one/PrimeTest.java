package Assignment_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    @Test
    void isPrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertFalse(Prime.isPrime(4));
        assertTrue(Prime.isPrime(5));

    }
}
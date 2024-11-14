package Assignment_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToPalindromeTest {
    @Test
    void testStringToPalindrome() {
        assertTrue(StringToPalindrome.isPalindrome("radar"));
        assertTrue(StringToPalindrome.isPalindrome("level"));
        assertFalse(StringToPalindrome.isPalindrome("ABCD"));
        assertFalse(StringToPalindrome.isPalindrome("Window"));
    }

}
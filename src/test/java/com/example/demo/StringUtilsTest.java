package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }

    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }

    @Test
    public void testCountVowels() {
        assertEquals(2, stringUtils.countVowels("hello"));
        assertEquals(5, stringUtils.countVowels("education"));
        assertEquals(0, stringUtils.countVowels(""));
        assertEquals(0, stringUtils.countVowels(null));
    }

    @Test
    public void testCapitalize() {
        assertEquals("Hello", stringUtils.capitalize("hello"));
        assertEquals("Hello world", stringUtils.capitalize("hello world"));
        assertEquals("", stringUtils.capitalize(""));
        assertNull(stringUtils.capitalize(null));
    }
}
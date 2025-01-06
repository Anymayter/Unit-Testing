# Unit-Testing
1. Mô Tả Dự Án
StringUtils là một dự án Java đơn giản cung cấp các phương thức xử lý chuỗi thông dụng như:
- Kiểm tra chuỗi đối xứng (Palindrome)
- Đảo ngược chuỗi
- Đếm số nguyên âm
- Viết hoa chữ cái đầu tiên
Dự án bao gồm JUnit 5 để kiểm thử các phương thức và đảm bảo tính đúng đắn của mã nguồn.

2. Công Nghệ Sử Dụng
Java 11+
JUnit 5
Maven (hoặc Gradle, nếu cần)

3. Mã Nguồn
   
StringUtils.java

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
StringUtilsTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

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

Result

![image](https://github.com/user-attachments/assets/ca6c4a17-bd6c-4e02-a7d0-0ae8cd9f725d)

Author

Nguyễn Đức Toàn



Unit Test with Java

# Unit-Testing
# 1. Mô Tả Dự Án
StringUtils là một dự án Java đơn giản cung cấp các phương thức xử lý chuỗi thông dụng như:
- Kiểm tra chuỗi đối xứng (Palindrome)
- Đảo ngược chuỗi
- Đếm số nguyên âm
- Viết hoa chữ cái đầu tiên
  
Dự án bao gồm JUnit 5 để kiểm thử các phương thức và đảm bảo tính đúng đắn của mã nguồn.

# 2. Công Nghệ Sử Dụng

- Java 11+
- JUnit 5
- Maven (hoặc Gradle, nếu cần)

# 3. Mã Nguồn
   
StringUtils.java

```java
// src/main/java/com/anymayter/utils/StringUtils.java
package com.anymayter.utils;

/**
 * Utility class for common string operations.
 */
public class StringUtils {
    
    /**
     * Checks if a given string is a palindrome.
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        String clean = input.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
    
    /**
     * Reverses the given string.
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Counts the number of vowels in the given string.
     * @param input the string to check
     * @return the number of vowels
     */
    public static int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();
    }
    
    /**
     * Capitalizes the first letter of the given string.
     * @param input the string to capitalize
     * @return the capitalized string
     */
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}


```

StringUtilsTest.java

```java

// src/test/java/com/anymayter/utils/StringUtilsTest.java
package com.anymayter.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for StringUtils class.
 */
class StringUtilsTest {
    
    @Test
    void testIsPalindrome_ValidPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"", " ", "a", "@#&^"})
    void testIsPalindrome_EdgeCases(String input) {
        assertFalse(StringUtils.isPalindrome(input));
    }
    
    @Test
    void testIsPalindrome_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.isPalindrome(null));
    }
    
    @Test
    void testReverse_ValidInput() {
        assertEquals("cba", StringUtils.reverse("abc"));
    }
    
    @Test
    void testReverse_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.reverse(null));
    }
    
    @Test
    void testCountVowels_ValidInput() {
        assertEquals(2, StringUtils.countVowels("hello"));
    }
    
    @Test
    void testCountVowels_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.countVowels(null));
    }
    
    @Test
    void testCapitalize_ValidInput() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }
    
    @Test
    void testCapitalize_NullInput() {
        assertThrows(IllegalArgumentException.class, () -> StringUtils.capitalize(null));
    }
}

```

# 4. Các Phương Thức Chính Trong StringUtils

| **Tên Phương Thức**                        | **Mô Tả**                                | **Tham Số Đầu Vào**          | **Giá Trị Trả Về**         | **Ví Dụ**                     |
|--------------------------------------------|------------------------------------------|-----------------------------|----------------------------|--------------------------------|
| `boolean isPalindrome(String str)`         | Kiểm tra chuỗi có phải là Palindrome.    | `String str`               | `true` hoặc `false`         | `"madam"` → `true`             |
| `String reverse(String str)`               | Đảo ngược chuỗi đầu vào.                 | `String str`               | Chuỗi đảo ngược            | `"hello"` → `"olleh"`          |
| `int countVowels(String str)`              | Đếm số nguyên âm trong chuỗi.            | `String str`               | Số lượng nguyên âm          | `"hello"` → `2`               |
| `String capitalize(String str)`            | Viết hoa chữ cái đầu tiên của chuỗi.     | `String str`               | Chuỗi viết hoa             | `"hello"` → `"Hello"`          |
| `boolean isEmpty(String str)`              | Kiểm tra chuỗi có rỗng hay không.        | `String str`               | `true` hoặc `false`         | `""` → `true`                 |
| `boolean containsSubstring(String str, String subStr)` | Kiểm tra chuỗi con có tồn tại trong chuỗi chính. | `String str`, `String subStr` | `true` hoặc `false` | `"hello", "ll"` → `true` |
| `String trim(String str)`                  | Loại bỏ khoảng trắng đầu và cuối chuỗi.  | `String str`               | Chuỗi sau khi loại bỏ khoảng trắng | `"  hello  "` → `"hello"` |
| `int length(String str)`                   | Trả về độ dài của chuỗi.                 | `String str`               | Độ dài chuỗi               | `"hello"` → `5`                |


# 5. Dependency cho Pom.xml

```java
<dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
</dependency>
```

# 6. Tích hợp Jacoco để theo dõi độ bao phủ mã

```java
// pom.xml (JaCoCo Integration)
<project>
    <build>
        <plugins>
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.7</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>verify</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>

```

# 7. CI/CD với GitHub Actions

```java
// .github/workflows/test.yml
name: Java CI with Maven

on:
  push:
    branches: [ main ]
  pull_request:
    branches: [ main ]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    - uses: actions/checkout@v2
    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: '11'
        distribution: 'adopt'
    - name: Build with Maven
      run: mvn clean verify
    - name: Generate JaCoCo Report
      run: mvn jacoco:report
    - name: Upload Coverage Report
      uses: actions/upload-artifact@v2
      with:
        name: jacoco-report
        path: target/site/jacoco
```


# 8. Kết quả Test

![image](https://github.com/user-attachments/assets/ca6c4a17-bd6c-4e02-a7d0-0ae8cd9f725d)

# 9. Mã nguồn Chatgpt

https://chatgpt.com/share/677c0efd-72b0-800b-8fa7-2d87258b496c

# 10. Sinh viên

Nguyễn Đức Toàn




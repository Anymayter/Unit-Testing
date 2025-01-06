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
public class StringUtils {
   // Kiểm tra chuỗi đối xứng (Palindrome)
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
   // Đảo ngược chuỗi
    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }
   // Đếm số nguyên âm
    public int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
   // Viết hoa chữ cái đầu tiên
    public String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

```

StringUtilsTest.java

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();
   // Kiểm tra chuỗi đối xứng (Palindrome)
    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("madam"));
        assertFalse(stringUtils.isPalindrome("hello"));
        assertFalse(stringUtils.isPalindrome(null));
    }
   // Đảo ngược chuỗi
    @Test
    public void testReverse() {
        assertEquals("olleh", stringUtils.reverse("hello"));
        assertEquals("", stringUtils.reverse(""));
        assertNull(stringUtils.reverse(null));
    }
   //  Đếm số nguyên âm
    @Test
    public void testCountVowels() {
        assertEquals(2, stringUtils.countVowels("hello"));
        assertEquals(5, stringUtils.countVowels("education"));
        assertEquals(0, stringUtils.countVowels(""));
        assertEquals(0, stringUtils.countVowels(null));
    }
    // Viết hoa chữ cái đầu tiên
    @Test
    public void testCapitalize() {
        assertEquals("Hello", stringUtils.capitalize("hello"));
        assertEquals("Hello world", stringUtils.capitalize("hello world"));
        assertEquals("", stringUtils.capitalize(""));
        assertNull(stringUtils.capitalize(null));
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

# 6. Kết quả Test

![image](https://github.com/user-attachments/assets/ca6c4a17-bd6c-4e02-a7d0-0ae8cd9f725d)

# 5. Sinh viên

Nguyễn Đức Toàn




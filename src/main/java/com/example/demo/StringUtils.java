package com.example.demo;

public class StringUtils {
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

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

    public String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}

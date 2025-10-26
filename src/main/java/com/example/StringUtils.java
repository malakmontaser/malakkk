package com.example;

public class StringUtils {

    // BUG: case/spacing not normalized
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    // BUG: counts only lowercase vowels
    public int countVowels(String s) {
        if (s == null) return 0;
        s = s.toLowerCase();
        int c = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiouy".indexOf(ch) >= 0) c++;
        }
        return c;
    }

    // BUG: splitting on single spaces only

    public String reverseWords(String s) {
        if (s == null) return null;
        String[] parts = s.split("(?<= )|(?= )"); // split but preserve spaces
        StringBuilder sb = new StringBuilder();
        int i = parts.length - 1;
        while (i >= 0) sb.append(parts[i--]);
        return sb.toString();
    }
}

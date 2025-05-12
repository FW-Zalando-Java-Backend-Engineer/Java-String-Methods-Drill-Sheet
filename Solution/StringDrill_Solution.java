package com.example.exercises;

/**
 * ✅ Official Solution: Java String Methods Drill Sheet
 */
public class StringDrill {

    /**
     * Checks if a string is a palindrome (case-insensitive, ignoring spaces).
     */
    public boolean isPalindrome(String input) {
        input = input.toLowerCase().replace(" ", ""); // Normalize: lowercase and remove spaces
        String reversed = ""; // We'll build the reversed string manually
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return input.equals(reversed); // Compare normalized input with reversed
    }

    /**
     * Replaces all vowels with '*'.
     * Note: No regex used; simple char-by-char replacement.
     */
    public String replaceVowels(String input) {
        String result = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                result += "*";
            } else {
                result += c;
            }
        }
        return result;
    }

    /**
     * Capitalizes the first letter of each word.
     */
    public String capitalizeWords(String sentence) {
        sentence = sentence.trim();
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String first = words[i].substring(0, 1).toUpperCase();
                String rest = words[i].substring(1).toLowerCase();
                result += first + rest;
                if (i < words.length - 1) result += " ";
            }
        }
        return result;
    }

    /**
     * Counts occurrences of a specific word (case-insensitive).
     */
    public int countWordOccurrences(String sentence, String word) {
        sentence = sentence.trim().toLowerCase();
        word = word.toLowerCase();

        if (sentence.isEmpty()) return 0;

        String[] words = sentence.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
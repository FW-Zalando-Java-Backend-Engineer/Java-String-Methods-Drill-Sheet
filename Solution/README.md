# ✅ Official Solution: Java String Methods Drill Sheet

## 🧩 Problem Recap

This drill challenged students to apply core `String` methods in realistic scenarios:
- Checking palindromes
- Replacing vowels
- Capitalizing names
- Counting word frequency

## 🎯 Objectives

The goal was to reinforce the use of:
- `.length()`, `.trim()`, `.toUpperCase()`, `.toLowerCase()`
- `.substring()`, `.contains()`, `.replace()`, `.charAt()`
- `.indexOf()`, `.split()`, `.equalsIgnoreCase()`

## ✅ Solution Summary

### 1. `isPalindrome(String input)`
- Normalized the input (lowercase, no spaces)
- Reversed the string manually using a loop
- Compared it with the original

### 2. `replaceVowels(String input)`
- Looped through each character
- Checked if it's a vowel using `indexOf()` in a `vowels` string
- Replaced with `*`

### 3. `capitalizeWords(String sentence)`
- Trimmed sentence and split into words
- Capitalized the first letter, lowercased the rest for each word
- Re-joined them with spaces

### 4. `countWordOccurrences(String sentence, String word)`
- Normalized sentence and word to lowercase
- Split the sentence and looped through to count matches

## 🚀 Bonus Tip

All solutions used only the approved String methods — no regex, no advanced libs — to stay aligned with the learning focus for the day.

---

Happy coding, and great job solving with core Java! 🔧

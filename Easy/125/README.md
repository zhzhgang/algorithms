# [Valid Palindrome][title]

## Description

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

**Note:** For the purpose of this problem, we define empty string as valid palindrome.

**Example 1:**

**Input:** "A man, a plan, a canal: Panama"
**Output:** true

**Example 2:**

**Input:** "race a car"
**Output:** false


## 方法 

### 思路

题意是给定一个字符串，判断其是否为一个回文串。只考虑字母和数字，忽略大小写


### 实现
```java
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        int front = 0;
        int end = s.length() - 1;
        
        while (front < end) {
            while (front < s.length() && !isValid(s.charAt(front))) {
                front++;
            }
            
            // s 不包含任何数字字母字符
            if (front == s.length()) {
                return true;
            }
            
            while (end > 0 && !isValid(s.charAt(end))) {
                end--;
            }
            
            if (Character.toLowerCase(s.charAt(front)) != Character.toLowerCase(s.charAt(end))) {
                break;
            } else {
                front++;
                end--;
            }
        }
        
        return front >= end;
    }
    
    private boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
```

### 复杂度分析

- Time complexity：O(N)，其中 N 为字符串的长度。
- Space complexity：O(1)，只需要 2 个变量。


[title]: https://leetcode.com/problems/valid-palindrome/description/
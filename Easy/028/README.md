# [Implement strStr()][title]

## Description

Implement strStr().

Return the index of the first occurrence of needle in haystack, or **-1** if needle is not part of haystack.

**Example 1**:

```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Example 2**:

```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

## 方法

### 思路
题意是返回字符串中子串首次出现的索引，如果没有该子串则返回 -1。

### 实现
```java
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
```

### 复杂度分析

- Time complexity：O(m - n)。
- Space complexity：O(1)。



[title]: https://leetcode.com/problems/implement-strstr/description/
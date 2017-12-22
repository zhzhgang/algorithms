# [Longest Common Prefix][title]

## Description

Write a function to find the longest common prefix string amongst an array of strings.


## 方法 1 

### 思路

题意是从字符串数组中找出最长公共前缀，一个简单的方法是：

LCP(S1…Sn)=LCP(LCP(LCP(S1,S2),S3),…Sn)

即遍历数组 [S1...Sn]，对于每次遍历 i，找到最长公共前缀 LCP(S1...Si)，当 LCP(S1...Si) 为空字符串时，算法结束。在 n 次遍历之后，算法返回 LCP(S1...Sn)。

### 实现

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }    
            }
        }
        return prefix;
    }
}
```

### 复杂度分析

- Time complexity：O(S)，其中 S 是所有字符串的字符数总和。最坏的情况是，所有 n 个字符串都是一样的。
- Space complexity：O(1)，只需要使用常数的额外空间。


## 方法 2

### 思路

如果一个非常短的字符串在数组的末尾，那么方法 1 仍然会执行 S 次比较。优化方法是，一次迭代，比较所有字符串同一位置的字符，

### 实现

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
```

### 复杂度分析

- Time complexity：O(S)，其中 S 是所有字符串的字符数总和。最坏的情况是，n 个长度为 m 的字符串都相同，该算法会执行 n * m 次比较。虽然最坏的情况和方法 1 一样，但是在最好的情况下，最多只会执行 n * minLen 次比较，其中 minLen 是数组中最短的字符串的长度。
- Space complexity：O(1)，只需要使用常数的额外空间。

























[title]: https://leetcode.com/problems/longest-common-prefix/description/
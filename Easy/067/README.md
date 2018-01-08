# [Add Binary][title]

## Description

Given two binary strings, return their sum (also a binary string).

For example,

a = "11"
b = "1"

Return "100"

## 方法

### 思路

题意是对两个二进制数字符串求和，返回一个字符串。首先确定两个字符串哪个是较长的，哪个是较短的，初始化进位值为 0。先从后向前遍历较短的长度，每次将两个字符串对应下标的值和进位值相加，然后求商，赋给下一次遍历的进位值；求余数，赋给该下标位置的结果值。较短长度遍历完成后，遍历较长长度剩余部分，每次将当前下标位置的值和进位值相加，求商和求余数，分别赋给下一次遍历的进位值和当前位置结果。

### 实现
```java
class Solution {
    public String addBinary(String a, String b) {
        String longer = (a.length() >= b.length() ? a : b);
        String shorter = (a.length() < b.length() ? a : b);
        int il = longer.length() - 1;
        int is = shorter.length() - 1;
        char[] result = new char[longer.length() + 1];
        int index = result.length - 1;
        int cf = 0;
        while (is >= 0) {
            int quo = (Integer.parseInt(String.valueOf(longer.charAt(il))) + Integer.parseInt(String.valueOf(shorter.charAt(is))) + cf) / 2;
            int mod = (Integer.parseInt(String.valueOf(longer.charAt(il))) + Integer.parseInt(String.valueOf(shorter.charAt(is))) + cf) % 2;
            result[index] = String.valueOf(mod).charAt(0);
            cf = quo;
            
            il--;
            is--;
            index--;
        }
        
        while (il >= 0) {
            int quo = (Integer.parseInt(String.valueOf(longer.charAt(il))) + cf) / 2;
            int mod = (Integer.parseInt(String.valueOf(longer.charAt(il))) + cf) % 2;
            result[index] = String.valueOf(mod).charAt(0);
            cf = quo;

            il--;
            index--;
        }
        
        result[index] = String.valueOf(cf).charAt(0);
        
        if (cf == 1) {
            return String.valueOf(result);
        } else {
            return String.valueOf(result).substring(1, result.length);
        }
    }
}
```

### 复杂度分析

- Time complexity：O(n)，n 为较长字符串的长度。
- Space complexity：O(n)。


[title]: https://leetcode.com/problems/add-binary/description/
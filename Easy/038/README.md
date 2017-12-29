# [Count and Say][title]

## Description

The count-and-say sequence is the sequence of integers with the first five terms as following:

```
1.     1
2.     11
3.     21
4.     1211
5.     111221
```

1 is read off as "one 1" or 11.

11 is read off as "two 1s" or 21.

21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

**Example 1**:

```
Input: 1
Output: "1"
```

**Example 2**:

```
Input: 4
Output: "1211"
```

## 方法

### 思路

题意是按规则 “读” 出第 n - 1 个数，例如 n = 5，第 4 个数为 1211，即为 1 个 1,1 个 2，2 个 1，连起来就是 111221，所以第 5 个数就是 111221，以此类推，第 6 个数就是 312211。

### 实现
```java
class Solution {
    public String countAndSay(int n) {
        String result = "1";
        while (n > 1) {
            char[] chars = result.toCharArray();
            int len = chars.length;
            int times = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < len; i++) {
                if (chars[i] == chars[i - 1]) {
                    times++;
                } else {
                    sb.append(times).append(chars[i - 1]);
                    times = 1;
                }
            }
            result = sb.append(times).append(chars[len - 1]).toString();
            n--;
        }
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n^2)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/count-and-say/description/
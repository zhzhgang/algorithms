# [Length of Last Word][title]

## Description

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

**Note**: A word is defined as a character sequence consists of non-space characters only.

**Example**:

```
Input: "Hello World"
Output: 5
```

## 方法

### 思路

题意是从一个只包含大小写字母和空格的字符串中计算出最后一个单次的长度。倒序遍历，先找到第一个不为个空格的字符的索引，再找到接下来第一个为空格的索引，两者相减。

### 实现
```java
class Solution {
    public int lengthOfLastWord(String s) {
        int position = s.length() - 1;
        while (position >= 0 && s.charAt(position) == ' ') {
            position--;
        }
        int end = position;
        while (position >= 0 && s.charAt(position) != ' ') {
            position--;
        }
        return end - position;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/length-of-last-word/description/
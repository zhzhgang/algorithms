# [Valid Parentheses][title]

## Description

Given a string containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

The brackets must close in the correct order, `"()"` and `"()[]{}"` are all valid but `"(]"` and `"([)]"` are not.

## 方法

### 思路
题意是判断括号匹配是否正确，可以用栈来解决这个问题。首先将字符串转成字符数组，遍历数组。如果是左括号，直接入栈；如果是右括号，判断栈顶字符是否是与其相对应的左括号，如果不是直接返回 false，如果是则弹出栈顶字符。遍历结束之后，判断是否为空栈。

### 实现
```java
class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 1;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack[top++] = c;
            } else if (c == ')' && stack[top - 1] != '(') {
                return false;
            } else if (c == '}' && stack[top - 1] != '{') {
                return false;
            } else if (c == ']' && stack[top - 1] != '[') {
                return false;
            } else {
                top--;
            }
        }
        return top == 1;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。其中 n 为字符串的长度。
- Space complexity：O(n)，其中 n 为字符串的长度。


[title]: https://leetcode.com/problems/valid-parentheses/description/

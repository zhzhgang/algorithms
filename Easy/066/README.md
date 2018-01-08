# [Plus One][title]

## Description

Given a non-negative integer represented as a **non-empty** array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.

## 方法

### 思路

题意是给你一个由非负整数组成的非空数组，高位在前，首位不为 0 除非这个数组就是 [0]。要求给数组低位加 1。从最低位开始遍历，用一个布尔型变量记录是否进位，如果当前位大于等于 9，则当前位置为 0，进位变量为 true，否则当前位 + 1，遍历结束。需要注意的是，如果一直进位到首位，也就是所有位都是 9，那么需要新创建一个长度 + 1 的数组，首位置 1，其他位全部置 0。

### 实现
```java
class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        boolean isCarryBit = (digits[index] >= 9);
        while (index >= 0) {
            if (isCarryBit) {
                if (index == 0) {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    for (int i = 1; i < result.length; i++) {
                        result[i] = 0;
                    }
                    return result;
                }
                digits[index] = 0;
                isCarryBit = (digits[--index] >= 9 ? true : false);
            } else {
                digits[index] += 1;
                break;
            }
        }
        return digits;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)，极端情况为 O(n)。


[title]: https://leetcode.com/problems/plus-one/description/
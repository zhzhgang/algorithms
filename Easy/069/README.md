# [Sqrt(x)][title]

## Description

Implement int sqrt(int x).

Compute and return the square root of x.

**x** is guaranteed to be a non-negative integer.


**Example 1**:

```
Input: 4
Output: 2
```

**Example 2**:

```
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.
```

## 方法 

### 思路

题意是实现 sqrt(int x) （求平方根）函数，返回一个整数的平方根的整数部分。

### 实现
```java
class Solution {
    public int mySqrt(int x) {
        int i = 1;
        while ((i * i) - x <= 0) {
            i += 1;
        }
        return (i - 1);
    }
}
```

### 复杂度分析

- Time complexity：O(log2N)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/sqrtx/description/
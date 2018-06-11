# [Climbing Stairs][title]

## Description

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

**Note**: Given n will be a positive integer.

**Example 1**:

```
Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps

```

**Example 2**:

```
Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

```
## 方法 

### 思路

题意是 n 层的楼梯，每次可以爬一层或者两层，到顶层一共有多少种不同方案。假设到顶层有 f(n) 种方案，则 f(n) = f(n-1) + f(n-2)。

### 实现
```java
class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (--n > 0) {
            b = b + a;
            a = b - a;
        }
        return b;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/climbing-stairs/description/
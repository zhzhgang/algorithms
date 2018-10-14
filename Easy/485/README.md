# [Max Consecutive Ones][title]

## Description

Given a binary array, find the maximum number of consecutive 1s in this array.

**Example 1:**

**Input:** [1,1,0,1,1,1]
**Output:** 3
**Explanation:** The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.

**Note:**

*   The input array will only contain `0` and `1`.
*   The length of input array is a positive integer and will not exceed 10,000


## 方法

### 思路

题意是给定一个二进制数组， 计算其中最大连续 1 的个数。

遍历数组，用一个计数器 count 来统计 1 的个数，如果当前数字为 1，count 自增 1，然后每次更新结果 result；如果当前数字为 0， count 重置为0。

### 实现
```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        
        for (int num : nums) {
            if (num == 1) {
                count++;
                result = Math.max(count, result);
            } else {
                count = 0;
            }
        }
        
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。



[title]: https://leetcode.com/problems/max-consecutive-ones/description/
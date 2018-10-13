# [Missing Number][title]

## Description

Given an array containing _n_ distinct numbers taken from `0, 1, 2, ..., n`, find the one that is missing from the array.

**Example 1:**

**Input:** [3,0,1]
**Output:** 2

**Example 2:**

**Input:** [9,6,4,2,3,5,7,0,1]
**Output:** 8

**Note**:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?


## 方法 

### 思路

题意是给定一个包含 0 .. N 中 N 个数的数组，找出 0 .. N 中没有出现在数组中的那个数。

### 实现
```java
class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        
        for (int i : nums) {
            actualSum += i;
        } 
        
        return expectedSum - actualSum;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/missing-number/description/
# [Maximum Average Subarray I][title]

## Description

Given an array consisting of `n` integers, find the contiguous subarray of given length `k` that has the maximum average value. And you need to output the maximum average value.

**Example 1:**

**Input:** [1,12,-5,-6,50,3], k = 4
**Output:** 12.75
**Explanation:** Maximum average is (12-5-6+50)/4 = 51/4 = 12.75

**Note:**

1.  1 <= `k` <= `n` <= 30,000.
2.  Elements of the given array will be in the range [-10,000, 10,000].


## 方法 

### 思路

题意是给定一个由`n`个整数组成的数组，找到给定长度`k`的连续子数组，该子数组具有最大平均值。输出该最大平均值。

### 实现
```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0.0d;
        double tempSum = 0.0d;
        
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                maxSum += nums[i];
                tempSum += nums[i];
            } else {
                tempSum -= nums[i - k];
                tempSum += nums[i];
                
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        
        return maxSum / k;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/maximum-average-subarray-i/
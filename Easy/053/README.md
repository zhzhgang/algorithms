# [Maximum Subarray][title]

## Description

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

## 方法

### 思路

题意是找出数组中具有最大和的子数组。可采用动态规划，如果当前序列和大于 0，就加下一个元素，并和已有最大值进行比较；如果当前序列和小于 0 ，则从当前元素重新算起。

### 实现
```java
class Solution {
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max = dp;
        for (int i = 1; i < nums.length; i++) {
            dp = nums[i] + (dp > 0 ? dp : 0);
            if (dp > max) {
                max = dp;
            }
        }
        return max;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/maximum-subarray/description/
# [Longest Continuous Increasing Subsequence][title]

## Description

Given an unsorted array of integers, find the length of longest `continuous` increasing subsequence (subarray).

**Example 1:**

**Input:** [1,3,5,4,7]
**Output:** 3
**Explanation:** The longest continuous increasing subsequence is [1,3,5], its length is 3\. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4\. 

**Example 2:**

**Input:** [2,2,2,2,2]
**Output:** 1
**Explanation:** The longest continuous increasing subsequence is [2], its length is 1\. 

**Note:** Length of the array will not exceed 10,000.


## 方法 

### 思路

题意是给定一个无序的整数数组，找出该数组中的最长连续上升子序列的长度。

### 实现
```java
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int result = 1;
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 1;
            }
        }
        
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/longest-continuous-increasing-subsequence/
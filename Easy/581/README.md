# [Shortest Unsorted Continuous Subarray][title]

## Description

Given an integer array, you need to find one **continuous subarray** that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the **shortest** such subarray and output its length.

**Example 1:**

**Input:** [2, 6, 4, 8, 10, 9, 15]
**Output:** 5
**Explanation:** You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

**Note:**

1.  Then length of the input array is in range [1, 10,000].
2.  The input array may contain duplicates, so ascending order here means **<=**.


## 方法 

### 思路

题意是给定一个整型数组，找出其中的一个连续的子数组，使得如果将该子数组按升序排序，那么原数组也会按升序排序，找出符合此要求的最短的子数组并返回其长度。

### 实现
```java
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int begin = -1, end = -2;
        int max = nums[0], min = nums[len - 1];
        
        for (int i = 1; i < len; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[len - (i + 1)]);
            
            if (max > nums[i]) {
                end = i;
            }
            
            if (min < nums[len - (i + 1)]) {
                begin = len - (i + 1);
            }
        }
        
        return end - begin + 1;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/shortest-unsorted-continuous-subarray
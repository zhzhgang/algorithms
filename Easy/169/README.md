# [Majority Element][title]

## Description

Given an array of size _n_, find the majority element. The majority element is the element that appears **more than** `⌊ n/2 ⌋` times.

You may assume that the array is non-empty and the majority element always exist in the array.

**Example 1:**

**Input:** [3,2,3]
**Output:** 3

**Example 2:**

**Input:** [2,2,1,1,1,2,2]
**Output:** 2

## 方法 

### 思路

题意是给定一个大小为 n 的数组，找出数组中出现次数超过 n / 2 次的元素。


### 实现
```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majorityElement = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
            }
            
            count += (majorityElement == nums[i]) ? 1 : -1;
        }
        
        return majorityElement;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/majority-element/description/
# [Contains Duplicate II][title]

## Description

Given an array of integers and an integer _k_, find out whether there are two distinct indices _i_ and _j_ in the array such that **nums[i] = nums[j]** and the **absolute** difference between _i_ and _j_ is at most _k_.

**Example 1:**

**Input:** nums = [1,2,3,1], k = 3
**Output:** true

**Example 2:**

**Input:** nums = [1,0,1,1], k = 1
**Output:** true

**Example 3:**

**Input:** nums = [1,2,3,1,2,3], k = 2
**Output:** false


## 方法 

### 思路

题意是给定一个整型数组和一个整数 k，返回数组中是否存在重复元素，且其下标之差的绝对值不超过 k。

### 实现
```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k -1]);
            }
            
            if (!set.add(nums[i])) {
                return true;
            }
        }
        
        return false;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(n)。


[title]: https://leetcode.com/problems/contains-duplicate-ii/description/
# [Rotate Array][title]

## Description

Given an array, rotate the array to the right by _k_ steps, where _k_ is non-negative.

**Example 1:**

**Input:** `[1,2,3,4,5,6,7]` and _k_ = 3
**Output:** `[5,6,7,1,2,3,4]`
**Explanation:**
rotate 1 steps to the right: `[7,1,2,3,4,5,6]`
rotate 2 steps to the right: `[6,7,1,2,3,4,5]` 
rotate 3 steps to the right: `[5,6,7,1,2,3,4]`

**Example 2:**

**Input:** `[-1,-100,3,99]` and _k_ = 2
**Output:** [3,99,-1,-100]
**Explanation:** 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

**Note:**

*   Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
*   Could you do it in-place with O(1) extra space?

## 方法 

### 思路

题意是给定一个数组，通过 _k_ 步骤将数组向右旋转，其中 _k_ 是非负的。

先反转数组的所有元素，然后反转前 k 个元素，最后反转剩下的 n - k 个元素。

### 实现
```java
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}	
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/rotate-array/description/
# [Remove Duplicates from Sorted Array][title]

## Description

Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by **modifying the input array** in-place with O(1) extra memory.

**Example:**

```
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
```

## 方法

### 思路
题意是将一个有序数组中的重复元素移除，并返回移除之后数组的长度。如果数组长度为 0 或者 1，直接返回 0 或 1。否则定义两个变量 i 和 j，如果nums[i] = nums[j]，则 j + 1 跳过重复元素；如果 nums[j] ！= nums[i]，则 nums[i + 1] = nums[j]。

### 实现
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。



[title]: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
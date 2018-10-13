# [Move Zeroes][title]

## Description

Given an array `nums`, write a function to move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

**Example:**

**Input:** `[0,1,0,3,12]`
**Output:** `[1,3,12,0,0]`

**Note**:

1.  You must do this **in-place** without making a copy of the array.
2.  Minimize the total number of operations.


## 方法 

### 思路

题意是给定一个数组 _nums_ ，写一个函数将 `0` 移动到数组的最后面，非零元素保持原数组的顺序。

### 实现
```java
class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int index = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[index++] = i;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/move-zeroes/description/
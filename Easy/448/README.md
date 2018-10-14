# [Find All Numbers Disappeared in an Array][title]

## Description

Given an array of integers where 1 ≤ a[i] ≤ _n_ (_n_ = size of array), some elements appear twice and others appear once.

Find all the elements of [1, _n_] inclusive that do not appear in this array.

Could you do it without extra space and in O(_n_) runtime? You may assume the returned list does not count as extra space.

**Example:**

**Input:**
[4,3,2,7,8,2,3,1]

**Output:**
[5,6]


## 方法

### 思路

题意是给定一个整型数组 ，且 1 <= a[i] <= n （n 为数组长度），找出所有[1, n] 区间中没有出现在数组中的元素。

每个元素均在 [1, n] 之中，那么 **a[i] - 1** 是一个合法的数组下标。遍历数组，将 nums[nums[i] -1] = -nums[nums[i]-1]。

### 实现
```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。



[title]: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
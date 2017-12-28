# [Search Insert Position][title]

## Description

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

**Example 1**:

```
Input: [1,3,5,6], 5
Output: 2
```

**Example 2**:

```
Input: [1,3,5,6], 2
Output: 1
```

**Example 3**:

```
Input: [1,3,5,6], 7
Output: 4
```

**Example 1**:

```
Input: [1,3,5,6], 0
Output: 0
```

## 方法 1

### 思路
题意是从已排序且无重复元素的数组中返回给定目标的索引，如果没有则返回目标元素应该插入的位置索引。考虑到数组已排序，所以只需要找到第一个大于或等于目标元素的索引即可。

### 实现
```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。

## 方法 2

### 思路

由于元素已排序，可以使用二分查找法，效率更高。

### 实现

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        return low;
    }
}
```

### 复杂度分析

- Time complexity：O(log2N)。
- Space complexity：O(1)。

[title]: https://leetcode.com/problems/search-insert-position/description/
# [Remove Element][title]

## Description

Given an array and a value, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by **modifying the input array** in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

**Example:**

```
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.
```

## 方法 1

### 思路
题意是移除数组中所有等于给定值的元素，并返回移除之后数组的长度。定义两个变量 i 和 j，当 nums[j] 等于给定值 ，则 j + 1 跳过该元素；如果 nums[j] ！= val，则 nums[i] = nums[j]，然后 i + 1，重复以上过程直到 j 到达数组末尾，数组新长度为 i。

### 实现
```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。

## 方法 2

### 思路

在方法 1 中，如果数组中只有极少数的元素需要移除，仍然会进行大量不必要的元素移动。可以换一种思路，当 nums[i] = val 时，将当前元素赋值为数组最后一个元素，然后将记录数组长度的变量减 1。

### 实现

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return i;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。赋值操作的次数等于需要移除的元素个数，因此当需要移除的元素很少时，效率更高。
- Space complexity：O(1)。

[title]: https://leetcode.com/problems/remove-element/description/
# [Merge Sorted Array][title]

## Description

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

**Note**:

* The number of elements initialized in nums1 and nums2 are m and n respectively.
* You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

**Example 1**:

```
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
Output: [1,2,2,3,5,6]
```

## 方法 

### 思路

题意是给定两个已排序的数组，将两个数组合并为一个有序数组。

### 实现
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
        }
        
        if (n == 0) {
            return;
        }
        
        int index1 = 0;
        int index2 = 0;
        
        for (index1 = 0; index1 < m; index1++) {
            if (nums1[index1] <= nums2[index2]) {
                continue;
            } else {
                for (int i = m; i > index1; i--) {
                    nums1[i] = nums1[i - 1];
                }
                nums1[index1] = nums2[index2];
                m++;
                index2++;
                if (index2 == n) {
                    return;
                }
            }
        }
        if (index2 < n) {
            for (int i = 0; i < n - index2; i++) {
                nums1[index1 + i] = nums2[index2 + i];
            }
        }
    }
}

```

### 复杂度分析

- Time complexity：O(m*n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/merge-sorted-array/description/
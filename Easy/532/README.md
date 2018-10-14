# [K-diff Pairs in an Array][title]

## Description

Given an array of integers and an integer **k**, you need to find the number of **unique** k-diff pairs in the array. Here a **k-diff** pair is defined as an integer pair (i, j), where **i** and **j** are both numbers in the array and their [absolute difference](https://en.wikipedia.org/wiki/Absolute_difference) is **k**.

**Example 1:**

**Input:** [3, 1, 4, 1, 5], k = 2

**Output:** 2

**Explanation:** There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of **unique** pairs.

**Example 2:**

**Input:**[1, 2, 3, 4, 5], k = 1

**Output:** 4

**Explanation:** There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).

**Example 3:**

**Input:** [1, 3, 1, 5, 4], k = 0

**Output:** 1

**Explanation:** There is one 0-diff pair in the array, (1, 1).

**Note:**

1.  The pairs (i, j) and (j, i) count as the same pair.
2.  The length of the array won't exceed 10,000.
3.  All the integers in the given input belong to the range: [-1e7, 1e7].

## 方法

### 思路

题意是给定一个整型数组和一个整数 k，找出数组中不同的数对 （i, j）的个数，满足 i 和 j 之差的绝对值等于 k。

将数组中的元素和其出现的次数保存在 map 中，然后遍历 map 中的元素（避免了重复）, 如果 k = 0，只需要统计有多少元素在数组中重复出现过；否则只需要看元素 + k 是否也在 map 的 keySet 中。

### 实现
```java
class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(n)。



[title]: https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
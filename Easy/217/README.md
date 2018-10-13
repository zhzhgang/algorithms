# [Contains Duplicate][title]

## Description

Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

**Example 1:**

**Input:** [1,2,3,1]
**Output:** true

**Example 2:**

**Input:** [1,2,3,4]
**Output:** false

**Example 3:**

**Input:** [1,1,1,3,3,4,3,2,4,2]
**Output:** true

## 方法 

### 思路

题意是给定一个整型数组，返回其是否有重复元素。

### 实现
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(n)。


[title]: https://leetcode.com/problems/contains-duplicate/description/
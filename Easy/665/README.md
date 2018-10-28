# [Non-decreasing Array][title]

## Description

Given an array with `n` integers, your task is to check if it could become non-decreasing by modifying **at most** `1` element.

We define an array is non-decreasing if `array[i] <= array[i + 1]`holds for every `i` (1 <= i < n).

**Example 1:**

**Input:** [4,2,3]
**Output:** True
**Explanation:** You could modify the first `4` to `1` to get a non-decreasing array.

**Example 2:**

**Input:** [4,2,1]
**Output:** False
**Explanation:** You can't get a non-decreasing array by modify at most one element.

**Note:** The `n` belongs to [1, 10,000].


## 方法 

### 思路

题意是给定一个包含 `n` 个整数的数组，检测在改变**至多**一个元素的情况下，它是否可以变成不下降的。

定义一个数组是不下降的，如果 `array[i] <= array[i + 1]` 对于每一个 `i` (1 <= i < n) 都成立。

### 实现
```java
class Solution {
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int count = 0;
        int pos = 0;
        
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (count > 1) {
                    return false;
                }
                
                pos = i;
            }
        }
        
        if (count == 0) {
            return true;
        }
        
        return pos == 1 || pos == len - 1 || nums[pos - 2] <= nums[pos] || nums[pos - 1] <= nums[pos + 1];
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/non-decreasing-array/
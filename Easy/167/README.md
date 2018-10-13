# [Two Sum II - Input array is sorted][title]

## Description

Given an array of integers that is already **_sorted in ascending order_**, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

**Note:**

*   Your returned answers (both index1 and index2) are not zero-based.
*   You may assume that each input would have _exactly_ one solution and you may not use the _same_ element twice.

**Example:**

**Input:** numbers = [2,7,11,15], target = 9
**Output:** [1,2]
**Explanation:** The sum of 2 and 7 is 9\. Therefore index1 = 1, index2 = 2.


## 方法 

### 思路

题意是给定一个已经按升序排列的数组，找到两个数使他们加起来的和等于特定数。
函数应该返回这两个数的下标，index1 必须小于 index2。注意返回的值不是 0-based。
考虑使用双指针法。

### 实现
```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if (numbers == null || numbers.length < 2) {
            return result;
        }
        
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int v = numbers[left] + numbers[right];
            if (v == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (v < target) {
                left++;
            } else {
                right--; 
            }
        }
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
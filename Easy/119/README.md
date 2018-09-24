# [Pascal's Triangle II][title]

## Description

Given a non-negative index _k_ where _k_ ≤ 33, return the _k_ th index row of the Pascal's triangle.

Note that the row index starts from 0.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

**Example:**

Input: 3
Output: [1,3,3,1]



## 方法 

### 思路

题意是给定一个非负整数 k ，返回杨辉三角的第 k 行。

### 实现
```java
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(k^2)。
- Space complexity：O(k)。


[title]: https://leetcode.com/problems/pascals-triangle-ii/description/
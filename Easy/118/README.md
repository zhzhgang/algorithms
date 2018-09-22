# [Pascal's Triangle][title]

## Description

Given a non-negative integer _numRows_, generate the first _numRows_ of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

**Example:**

```
Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```


## 方法 

### 思路

题意是给定一个非负整数 numRows ，生成前 numRows 层杨辉三角。

### 实现
```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        if (numRows == 0) {
            return result;
        }
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum - 1);
            
            row.add(1);
            
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            row.add(1);
            
            result.add(row);
        }
        
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(numRows^2)。
- Space complexity：O(numRows^2)。


[title]: https://leetcode.com/problems/pascals-triangle/description/
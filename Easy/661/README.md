# [Image Smoother][title]

## Description

Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.

**Example 1:**

**Input:**
[[1,1,1],
 [1,0,1],
 [1,1,1]]
**Output:**
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
**Explanation:**
For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
For the point (1,1): floor(8/9) = floor(0.88888889) = 0

**Note:**

1.  The value in the given matrix is in the range of [0, 255].
2.  The length and width of the given matrix are in the range of [1, 150].


## 方法 

### 思路

题意是给定一个二维整数矩阵 M 表示图像的灰度，你需要设计一个smoother，使每个单元格的灰度变成其周围 8 个单元格及其自身的平均灰度(向下取整)。

### 实现
```java
class Solution {
    public int[][] imageSmoother(int[][] M) {
        if (M == null) {
            return null;
        }
        int rows = M.length;
        if (rows == 0) {
            return new int[0][];
        }
        int cols = M[0].length;
        
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < M.length; i++) {
            int[] temp = M[i];
            
            for (int j = 0; j < temp.length; j++) {
                double sum = M[i][j];
                int count = 1;
                
                if (j > 0) {
                    sum += M[i][j - 1];
                    count++;
                }
                
                if (j < temp.length - 1) {
                    sum += M[i][j + 1];
                    count++;
                }
                
                if (i > 0) {
                    sum += M[i - 1][j];
                    count++;
                    if (j > 0) {
                        sum += M[i - 1][j - 1];
                        count++;
                    }
                    if (j < temp.length - 1) {
                        sum += M[i - 1][j + 1];
                        count++;
                    }
                } 
                if (i < M.length - 1) {
                    sum += M[i + 1][j];
                    count++;
                    if (j > 0) {
                        sum += M[i + 1][j - 1];
                        count++;
                    }
                    if (j < temp.length - 1) {
                        sum += M[i + 1][j + 1];
                        count++;
                    }
                }
                
                result[i][j] = (int) Math.floor(sum / count);
            }
            
        }
        return result;
    }
}
```

### 复杂度分析

- Time complexity：O(n * m)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/image-smoother/
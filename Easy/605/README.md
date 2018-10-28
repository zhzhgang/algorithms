# [Can Place Flowers][title]

## Description

Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.

Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number **n**, return if **n** new flowers can be planted in it without violating the no-adjacent-flowers rule.

**Example 1:**

**Input:** flowerbed = [1,0,0,0,1], n = 1
**Output:** True

**Example 2:**

**Input:** flowerbed = [1,0,0,0,1], n = 2
**Output:** False

**Note:**

1.  The input array won't violate no-adjacent-flowers rule.
2.  The input array size is in the range of [1, 20000].
3.  **n** is a non-negative integer which won't exceed the input array size.


## 方法 

### 思路

题意是假设你有一个长花圃，其中有些地块已经被种植了，但是有些地块没有。但是，花不能够种植在相邻的地块下—他们会争夺水从而导致两者的死亡。

给定一个花圃（用一个包含 0 和 1 的数组来表示，其中 0 代表空，1 代表非空），和一个数字 **n**，返回 n 朵新的花在这个花圃上以能否在不违反“无相邻花”的规则种植。。

### 实现
```java
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed == null || flowerbed.length < n) {
            return false;
        }
        
        int count = 0;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
               && (i == 0 || flowerbed[i - 1] == 0)
               && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                
                flowerbed[i] = 1;
                count++;
            }
            
            if (count >= n) {
                return true;
            }
        }
        
        return false;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/can-place-flowers/
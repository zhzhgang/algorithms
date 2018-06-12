# [Same Tree][title]

## Description

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.


**Example 1**:

```
Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true

```

**Example 2**:

```
Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
```

**Example 3**:

```
Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
```


## 方法 

### 思路

题意是给定两个二叉树，判断这两个二叉树是否相同。判断相同的依据是两个二叉树有相同的结构和相同的值。可以考虑使用递归来处理。

### 实现
```java

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
}

```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/same-tree/description/
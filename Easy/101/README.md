# [Symmetric Tree][title]

## Description

Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

```
 	1
   / \
  2   2
 / \ / \
3  4 4  3
```
But the following [1,2,2,null,3,null,3] is not:

```
	1
   / \
  2   2
   \   \
   3    3
```

## 方法 

### 思路

题意是给定一个二叉树，判断这个二叉树是否是对称的。如果一个树是对称的，那么它的左子树和右子树互为镜像。两个树互为镜像，需要满足两个条件：

1. 两个树的根的值相同。
2. 每个树的右子树和另一个树的左子树互为镜像。

### 实现
```java

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    private boolean isMirror(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        
        if (node1 == null || node2 == null) {
            return false;
        }
        
        return (node1.val == node2.val) &&  isMirror(node1.right, node2.left) && isMirror(node1.left, node2.right);
    }
}

```

### 复杂度分析

- Time complexity：O(n)，n 为树的节点总数。
- Space complexity：递归次数决定于树的高度，在最坏的情况下，树是线型的，树的高度为 O(n)，因此最坏情况下的空间复杂度为 ）O(n)。


[title]: https://leetcode.com/problems/symmetric-tree/description/
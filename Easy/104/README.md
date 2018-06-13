# [Maximum Depth of Binary Tree][title]

## Description

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

**Note**：

A leaf is a node with no children.

**Example**：

Given binary tree [3,9,20,null,null,15,7],

```
 3
   / \
  9  20
    /  \
   15   7
```

return its depth = 3.

## 方法 

### 思路

题意是给定一个二叉树，找到他的最大深度。最大深度是从根节点到最远的叶节点的最长路径上的节点数。那么，二叉树的最大深度即为其左、右子树最大深度的较大值加 1。考虑使用递归。

### 实现
```java

class Solution {
     public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return 1;
        }
        
        if (root.left == null) {
            return 1 + maxDepth(root.right);
        }
        
        if (root.right == null) {
            return 1 + maxDepth(root.left);
        }
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

```

### 复杂度分析

- Time complexity：O(n)，n 为树的节点总数。
- Space complexity：递归次数决定于树的高度，在最坏的情况下，树是线型的，树的高度为 O(n)，因此最坏情况下的空间复杂度为 O(n)。


[title]: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
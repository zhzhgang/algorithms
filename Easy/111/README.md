# [Minimum Depth of Binary Tree][title]

## Description

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

**Note:** A leaf is a node with no children.

**Example:**

Given binary tree `[3,9,20,null,null,15,7]`,
```
    3
   / \
  9  20
    /  \
   15   7
```
return its minimum depth = 2.


## 方法 

### 思路

题意是给定一个二叉树，找出其最小深度。

二叉树的最小深度是指，从根节点到距离根节点最近的叶子节点的最短路径上的节点个数。

考虑使用递归来实现。



### 实现
```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1; 
    }
}
```

### 复杂度分析

- Time complexity：O(n)，n 为二叉树节点个数。
- Space complexity：O(log2N)。


[title]: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
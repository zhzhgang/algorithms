# [Balanced Binary Tree][title]

## Description

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

> a binary tree in which the depth of the two subtrees of _every_ node never differ by more than 1.

**Example 1:**

Given the following tree `[3,9,20,null,null,15,7]`:
```
    3
   / \
  9  20
    /  \
   15   7
```
Return true.

**Example 2:**

Given the following tree `[1,2,2,3,3,null,null,4,4]`:
```
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
```
Return false.

## 方法 

### 思路

题意是给定一个二叉树，判断其是否为高度平衡的二叉树（高度平衡的二叉树，其每个节点的左右子树的深度之差不超过 1.）

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
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }
    
    private int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        
        return Math.max(left, right) + 1;
    }
}

```

### 复杂度分析

- Time complexity：O(n)，n 为二叉树节点个数。
- Space complexity：O(log2N)。


[title]: https://leetcode.com/problems/balanced-binary-tree/description/
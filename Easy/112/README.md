# [Path Sum][title]

## Description

Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

**Note:** A leaf is a node with no children.

**Example:**

Given the below binary tree and `sum = 22`,

```
      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
```

return true, as there exist a root-to-leaf path `5->4->11->2` which sum is 22.


## 方法 

### 思路

题意是给定一个二叉树，以及一个值，判断是否存在一个从根节点到叶子节点的路径，使得该路径上所有节点的值相加等于给定值。

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        
        return hasPathSum(root.left, sum - root.val) 
            || hasPathSum(root.right, sum - root.val);
    }
}
```

### 复杂度分析

- Time complexity：O(n)，n 为二叉树节点个数。
- Space complexity：O(log2N)。


[title]: https://leetcode.com/problems/path-sum/description/
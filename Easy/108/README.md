# [Convert Sorted Array to Binary Search Tree][title]

二叉树的层次遍历 II

## Description

Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of _every_ node never differ by more than 1.

**For example:**

```
Given the sorted array: [-10,-3,0,5,9],
One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:

      0
     / \
   -3   9
   /   /
 -10  5
```


## 方法 

### 思路

题意是给定一个升序排序的数组，将其转换成一个高度平衡的二叉查找树（高度平衡的二叉树，其每个节点的左右子树的深度之差不超过 1.）

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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        
        return buildTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        
        TreeNode node = new TreeNode(nums[(start + end) / 2]);
        node.left = buildTree(nums, start, (start + end) / 2 -1);
        node.right = buildTree(nums, (start + end) / 2 + 1, end);
        return node;
    }
}

```

### 复杂度分析

- Time complexity：O(n)，n 为数组元素个数。
- Space complexity：O(log2N)。


[title]: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
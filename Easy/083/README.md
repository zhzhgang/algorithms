# [Remove Duplicates from Sorted List][title]

## Description

Given a sorted linked list, delete all duplicates such that each element appear only once.


**Example 1**:

```
Input: 1->1->2
Output: 1->2
```

**Example 2**:

```
Input: 1->1->2->3->3
Output: 1->2->3
```
## 方法 

### 思路

题意是给定一个已排序的链表，去除重复的元素。由于链表已排序，所以只需要比较当前节点的值与其下一个节点的值是否相等，即可确定该节点是否是重复节点，如果是重复节点，可以修改当前节点的 next 指针，使其指向下一个元素的 next。

### 实现
```java
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


[title]: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
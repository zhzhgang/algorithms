# [Merge Two Sorted Lists][title]

## Description

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

**Example:**
```
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
```
## 方法 1

### 思路
题意是将两个有序的链表合并成一个新的链表，可以用 **递归** 来解决这个问题。如果两个链表有一个为 null，则直接返回另外一个；否则判断两个链表哪个有较小的 head，然后设置其 next 为其 next 和另一个链表的合并结果，递归这一过程，最后返回拥有较小 head 链表。

### 实现
```java
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }
}
```

### 复杂度分析

- Time complexity：O(m + n)。其中 m 和 n 分别为两个链表的 size。
- Space complexity：O(m + n)。共有 m + n 层递归，所以空间复杂度是 O(m + n)。


[title]: https://leetcode.com/problems/merge-two-sorted-lists/description/

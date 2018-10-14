# [Third Maximum Number][title]

## Description

Given a **non-empty** array of integers, return the **third** maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

**Example 1:**

**Input:** [3, 2, 1]

**Output:** 1

**Explanation:** The third maximum is 1.

**Example 2:**

**Input:** [1, 2]

**Output:** 2

**Explanation:** The third maximum does not exist, so the maximum (2) is returned instead.

**Example 3:**

**Input:** [2, 2, 3, 1]

**Output:** 1

**Explanation:** Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.


## 方法 1

### 思路

题意是给定一个整型数组 ，返回数组中第三大的元素，如果不存在，返回最大的元素。

### 实现
```java
class Solution {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        
        for (Integer num : nums) {
            if (num == null || num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }
        
        return thirdMax == null ? max : thirdMax;
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。


## 方法 2

### 思路

这个问题可以扩展为，在包含 n 个元素的数组中找到第 k 大元素，因此基于最小堆的解决方案有效，考虑使用优先队列。

### 实现
```java
class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        
        for (Integer num : nums) {
            if (!set.contains(num)) {
                queue.offer(num);
                set.add(num);
                
                if (queue.size() > 3) {
                    set.remove(queue.poll());
                }
            }
        }
        
        if (queue.size() < 3) {
            while (queue.size() > 1) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
```

### 复杂度分析

- Time complexity：O(n)。
- Space complexity：O(1)。



[title]: https://leetcode.com/problems/third-maximum-number/description/
# [Best Time to Buy and Sell Stock II][title]

## Description

Say you have an array for which the _i_ th element is the price of a given stock on day _i_.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

**Note:** You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

**Example 1:**

**Input:** [7,1,5,3,6,4]
**Output:** 7
**Explanation:** Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
             Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

**Example 2:**

**Input:** [1,2,3,4,5]
**Output:** 4
**Explanation:** Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
             Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
             engaging multiple transactions at the same time. You must sell before buying again.

**Example 3:**

**Input:** [7,6,4,3,1]
**Output:** 0
**Explanation:** In this case, no transaction is done, i.e. max profit = 0.


## 方法 

### 思路

题意是假设有一个数组，它的第 i 个元素是一个给定的股票在第 i 天的价格。设计一个算法来找到最大的利润。可以完成尽可能多的交易(多次买卖股票)。然而，不能同时参与多个交易(必须在再次购买前出售股票)。


### 实现
```java
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        if (prices == null || prices.length == 0) {
            return profit;
        }
        
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (diff > 0) {
                profit += diff;
            }
        }
        
        return profit;
    }
}
```

### 复杂度分析

- Time complexity：O(N)，其中 N 为数组长度。
- Space complexity：O(1)，只需要 1 个变量。


[title]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
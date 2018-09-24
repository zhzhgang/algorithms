# [Best Time to Buy and Sell Stock][title]

## Description

Say you have an array for which the _i_ th element is the price of a given stock on day _i_.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

**Example 1:**

**Input:** [7,1,5,3,6,4]
**Output:** 5
**Explanation:** Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.

**Example 2:**

**Input:** [7,6,4,3,1]
**Output:** 0
**Explanation:** In this case, no transaction is done, i.e. max profit = 0.



## 方法 

### 思路

题意是有一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。如果你最多只允许完成一次交易（例如,一次买卖股票），设计一个算法来找出最大利润。



### 实现
```java
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (prices == null || prices.length == 0) {
            return maxProfit;
        }
        
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] >= minPrice) {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                minPrice = prices[i];
            }
        }
        
        return maxProfit;
    }
}
```

### 复杂度分析

- Time complexity：O(N)，其中 N 为数组长度。
- Space complexity：O(1)，只需要两个变量。


[title]: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solution/
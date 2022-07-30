/**
 * @Author 周金有
 * @Description 题目：买卖股票的最佳时机 II 给你一个整数数组 prices ，其中prices[i] 表示某支股票第 i 天的价格。
 * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候最多只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。 返回 你能获得的 最大 利润。
 * <p>
 * 示例 1： 输入：prices = [7,1,5,3,6,4] 输出：7 解释：在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 =
 * 5 - 1 = 4 。 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6 - 3 = 3 。 总利润为 4 + 3 =
 * 7 。
 * <p>
 * 示例 2： 输入：prices = [1,2,3,4,5] 输出：4 解释：在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 =
 * 5 - 1 = 4 。 总利润为 4 。
 * <p>
 * 示例3： 输入：prices = [7,6,4,3,1] 输出：0 解释：在这种情况下, 交易无法获得正利润，所以不参与交易可以获得最大利润，最大利润为 0 。
 * <p>
 * 作者：力扣 (LeetCode) 链接：https://leetcode.cn/leetbook/read/top-interview-questions-easy/x2zsx1/
 * 来源：力扣（LeetCode） 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date: Created in 16:14 2022/7/30
 **/
public class SolutionDay02 {

    /**
     * 低买高卖，求出利润总和
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        // 利润
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            // 如果第二天比第一天多计算利润, 如果少则利润为0
            profit += Math.max(prices[i + 1] - prices[i], 0);
        }
        return profit;
    }


    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int profit = maxProfit(prices);
        System.out.println("最大可获得利润：" + profit);
    }
}

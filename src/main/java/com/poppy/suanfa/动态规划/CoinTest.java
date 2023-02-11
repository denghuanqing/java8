package com.poppy.suanfa.动态规划;

/**
 * 动态绘规划问题
 * 1.基准值
 * 2.最优子问题
 * 3.备忘录/dp table
 */
public class CoinTest {
    public static void main(String[] args) {
        /**
         * 分别有coin面值的硬币，每种面值数额不限制，求出凑出amount面值最少需要多少颗硬币
         */
        int[] coin = new int[]{20, 10, 4, 9};
        int amount = 12;
        System.out.println("最小硬币数：" + minCoin(coin, amount));
    }

    public static int minCoin(int[] coins, int amount) {
        // 基准值
        if (amount == 0) return 0; // 面额为0 凑成功
        if (amount < 0) return -1;// 凑失败

        //子问题
        int res = Integer.MAX_VALUE;
        for (int coin : coins) {
            int sub = minCoin(coins, amount - coin);
            //子问题无解
            if (sub == -1) continue;
            res = Math.min(res, sub + 1);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

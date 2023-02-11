package com.poppy.suanfa.array.A前缀和;

/**
 * 前缀和数据
 * 计算数组的区间和
 */
public class NumArray {

    private static int[] nums = new int[]{1, 2, 3, 5, -5, 10};

    private static int[] Prenums = new int[nums.length + 1];


    public static void main(String[] args) {
        initPrenums();
        System.out.println(sumRange(2,6));
    }

    private static void initPrenums() {
        Prenums[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            Prenums[i + 1] = Prenums[i] + nums[i];
        }
    }

    private static int sumRange(int left, int right) {
        return Prenums[right] - Prenums[left-1];
    }
}

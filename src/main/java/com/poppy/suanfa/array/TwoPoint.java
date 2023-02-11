package com.poppy.suanfa.array;

import java.util.Arrays;

/**
 * 双指针
 */
public class TwoPoint {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 0, 6};
        moveZeroes(nums);
    }

    static void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for (int k=slow;k<nums.length;k++){
            nums[k]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}

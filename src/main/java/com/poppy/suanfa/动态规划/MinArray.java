package com.poppy.suanfa.动态规划;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

public class MinArray {
    private static int res = Integer.MIN_VALUE;
    private static int[][] dpCache = new int[3][3];
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};

//        System.out.println(matrix[0][1]);
        int temp =Integer.MAX_VALUE;
        for (int col = 0; col < matrix.length; col++) {
            temp = Math.min(temp,dp(matrix,0,col));
        }
//        int res = dp(matrix,0,1);
        System.out.println(temp);
        System.out.println(Arrays.toString(dpCache));
    }

    private static int dp(int[][] matrix, int row, int col) {
        // 边界
        if ((col < 0) || (col >= matrix.length)) {
            return 99999;
        }

        // 最后一行基准值
        if (row == matrix.length - 1) {
//            System.out.println(matrix[row][col]);
            return matrix[row][col];
        }
        int matrix1 = matrix[row][col];
//        System.out.println(matrix1);
        // 状态转移
        if (dpCache[row][col] != 0) {
            return dpCache[row][col];
        } else {
            int respon = matrix1 + min(+dp(matrix, row + 1, col - 1), dp(matrix, row + 1, col), dp(matrix, row + 1, col + 1));
            dpCache[row][col] = respon;
            return respon;
        }

    }
    private static int min(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}

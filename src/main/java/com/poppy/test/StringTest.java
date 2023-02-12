package com.poppy.test;

import java.util.PriorityQueue;

/**
 * description: StringTest <br>
 * date: 2023/2/11 14:22 <br>
 * author: Poppy <br>
 */
public class StringTest {
    public static void main(String[] args) {
        String s="String";
        System.out.println(s.substring(1,2));

        // 堆排序的优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            return a - b;
        });

        queue.add(5);
        queue.add(0);
        queue.add(7);
        queue.add(9);
        queue.forEach(m->{
            System.out.println(m);
        });

    }
}

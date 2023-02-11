package com.poppy.suanfa.sort;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> integers = new PriorityQueue<>();
        integers.add(5);
        integers.add(7);
        integers.add(3);
        System.out.println(integers.poll());

        PriorityQueue<Integer> integers1 = new PriorityQueue<Integer>((Integer p1, Integer p2) -> {
            return p2.compareTo(p1);
        });
        integers1.add(5);
        integers1.add(7);
        integers1.add(3);
        System.out.println(integers1.poll());


        int page=0;
        System.out.println(page++);
        System.out.println(page++);
    }


}

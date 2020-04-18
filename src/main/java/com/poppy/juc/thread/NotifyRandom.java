package com.poppy.juc.thread;

/**
 * description: 演示notify随机唤醒锁对象上的线程 <br>
 * date: 2020/4/18 13:41 <br>
 * author: Poppy <br>
 */
public class NotifyRandom {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                System.out.println("t1 get lock");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 end");
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                System.out.println("t2 get lock");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t2 end");
            }
        }, "t2");

        Thread t3 = new Thread(() -> {
            synchronized (obj) {
                System.out.println("t3 get lock");
                obj.notify();
            }
            System.out.println("t3 end");
        }, "t3");

        t1.start();
        t2.start();
        Thread.sleep(2000);

        t3.start(); // 可能唤醒t1,也有可能是t2
    }
}

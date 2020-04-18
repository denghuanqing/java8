package com.poppy.juc.thread;

public class ObjectLock {
    public static void main(String[] args) throws InterruptedException {
        Object obj = new Object();

//        obj.wait();  //  IllegalMonitorStateException  未获锁不能释放

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("t1释放锁");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("t1 end");
            }
        },"t1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("t2获得锁");
                    obj.notify();
                }
                System.out.println("t2 end");
            }

        },"t2").start();




    }
}

package com.poppy.juc.thread;

/**
 * description: join() 阻塞线程，变为同步执行 <br>
 * date: 2020/4/18 14:28 <br>
 * author: Poppy <br>
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1 end");
            }
        }, "t1");


        t1.start();

        t1.join(); // 主线程在这里阻塞等到T1线程执行完毕返回  CountDownLatch
        System.out.println("main is end");

    }
}

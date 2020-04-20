package com.poppy.juc.threadpool;

import java.util.concurrent.*;

/**
 * @description:
 * @author: DENGHUANQING1
 * @create: 2020-04-20 15:46
 **/
public class Test001 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(16));
//        threadPoolExecutor.execute(()->{
//           int a = 0/2;
//            System.out.println("m");
//        });

        /**
         * submit 提交任务一定要主动get，否则异常不会直接抛出。在spring boot 中需要重写 getAsyncUncaughtExceptionHandler方法
         */
        Future<?> m = threadPoolExecutor.submit(() -> {
            int a = 2 / 0;
            System.out.println("m");
        });

        while (!m.isDone()) {
            System.out.println("thread is end");
        }
        System.out.println(m.get());


    }
}

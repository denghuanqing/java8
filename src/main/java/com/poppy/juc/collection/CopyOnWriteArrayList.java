package com.poppy.juc.collection;

/**
 * @description:
 * @author: DENGHUANQING1
 * @create: 2020-04-20 14:27
 **/
public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        /**
         * 写时复制的策略，保证增删改的原子性，读取存在弱一致性
         */
        java.util.concurrent.CopyOnWriteArrayList<String> strings = new java.util.concurrent.CopyOnWriteArrayList<>();
        strings.add("11");
    }
}

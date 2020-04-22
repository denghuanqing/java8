package com.poppy.classloader;

/**
 * @description:
 * @author: DENGHUANQING1
 * @create: 2020-04-22 14:52
 **/
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = systemClassLoader.loadClass("com.poppy.time.TimeTest");
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Test.class.getClassLoader();

    }
}

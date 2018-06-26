package com.poppy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author poppy
 * @date 2018/5/24 11:39
 */
public class Lambda {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Linda", 12));
        students.add(new Student("Emmc", 34));
        students.add(new Student("Linda", 22));
        students.add(new Student("Linda", 56));

        students.forEach(stuende -> {
            System.out.println(stuende.getName());
        });
//
//        // 先按年龄  再按姓名
//        Collections.sort(students, (e1, e2) -> {
//            if (e1.getAge() == e2.getAge()) {
//                return e1.getName().compareTo(e2.getName());
//            } else {
//                return Integer.compare(e1.getAge(), e2.getAge());
//            }
//        });
//
//        Runnable runnable = () -> System.out.println("线程例子演示" + Thread.currentThread().getName());
//
//        new Thread(runnable).start();
//
//
//        students.stream().forEach(student -> System.out.println(student.toString()));
//
//        Runnable runnable2 = () -> {
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("演示线程+" + Thread.currentThread().getName());
//        };
//
//        new Thread(runnable2).start();
//
//        new Thread(
//                () -> {
//                    System.out.println("hello world"+Thread.currentThread().getName());
//                }
//        ).start();
                Calcator addCalcator = (a, b) -> {
            return a + b;
        };

        Calcator reduceCalcator = (a, b) -> {
            return a - b;
        };

        System.out.println(addCalcator.calc(10, 5));
        System.out.println(reduceCalcator.calc(10, 5));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        // 实质上调用了Consumer接口的accept方法
        numbers.forEach(x -> System.out.println(x));
    }
}

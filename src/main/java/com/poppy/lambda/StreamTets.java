package com.poppy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author poppy
 * @date 2018/5/25 12:04
 */
public class StreamTets {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("java", "python", "c");
//
//        Stream<String> stream = list.stream();
//        Stream<String> stringStream = list.parallelStream();
//
//        stream.forEach((m)-> {
//            System.out.println(m+" ::线程名:: "+Thread.currentThread().getName());
//        });
//
//        stringStream.forEach((m)-> {
//            // ? 并行流为什么是单线程
//            System.out.println(m+" ::线程名:: "+Thread.currentThread().getName());
//        });
//
//        IntStream stream1 = Arrays.stream(new int[5]);
//
//        Stream<String> ss = Stream.of("ss", "dd", "mm");
//
//        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
//        iterate.limit(10).forEach((m) -> System.out.println(m));
//
//        Stream<Double> generate = Stream.generate(() -> {
//            return Math.random();
//        });
//        generate.limit(5).forEach((m) -> System.out.println(m));

//        List<String> list = Arrays.asList("java", "python", "c");
//        Stream<String> stream = list.stream();
//        Stream<String> result = stream.filter((m) -> {
//            if (m.equals("java")) {
//                return true;
//            } else {
//                return false;
//            }
//        });
//        result.forEach((n) -> System.out.println(n));
//
//        Stream<String> skip = stream.skip(2);
//        skip.forEach((n) -> System.out.println(n));

//        List<String> list = Arrays.asList("java", "python", "c");
//        Stream<String> stringStream = list.stream().map((m) -> {
//            return m + "::map";
//        });
//        stringStream.forEach((n) -> System.out.println(n));
//
//        // 演示flatMap
//
//        Stream<String> stream = list.stream();
////        自然排序
////        Stream<String> sorted = stream.sorted();
////        sorted.forEach(n -> System.out.println(n));
//
//        stream.sorted((m, n) -> {
//            return m.compareTo(n);
//        }).forEach(n -> System.out.println(n));


//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("Emmc", 34));
//        students.add(new Student("Linda4", 12));
//        students.add(new Student("Linda3", 22));
//        students.add(new Student("Linda1", 56));
//
//
//        Map<String, Integer> collect = students.stream().collect(Collectors.toMap(n -> n.getName(), m -> m.getAge()));
//        System.out.println(collect.get("Linda1"));

//        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> integerStream = integers.stream().map(n -> n * n);
//        List<Integer> collect = integerStream.collect(Collectors.toList());
//        System.out.println(collect);

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        integers.parallelStream().forEach(M -> {
            System.out.println(Thread.currentThread().getName() + "::" + M);
        });

    }

    public static Stream<Character> str2Char(String m) {
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = m.toCharArray();
        for (char c : chars
                ) {
            list.add(Character.valueOf(c));
        }
        return list.stream();
    }
}

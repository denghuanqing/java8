package com.poppy.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author poppy
 * @date 2018/5/24 17:49
 * java 8 内置的核心函数接口 Function Interface
 */
public class InnerLambda {
    public static void main(String[] args) {
//        Consumer;
//        Supplier;
//        Function;
//        Predicate;

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(x -> System.out.println(x));
        Stream<Integer> stream = numbers.stream();

        Predicate<Object> isNull = (Object o) -> {
            if (o == null) {
                return true;
            }
            return false;
        };
        boolean test = isNull.test("s");
        System.out.println(test);

        Supplier<ArrayList<Integer>> s = () -> {
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                integers.add(i);
            }
            return integers;
        };

        ArrayList<Integer> integers = s.get();
        integers.stream().forEach(num -> System.out.println(num));

        Consumer<Boolean> consume= System.out::println;
        consume.accept(true);

        // 由于Supplier中的抽象方法没有参数，所以调用的是String的无参构造器
        Supplier<String> ss= String::new;
        System.out.println(ss.get());

        // 由于Function中的抽象方法有参数，所以调用的是String的带参构造器
        Function<String,String> sss=String::new;
        System.out.println(sss.apply("java niubi"));
    }
}

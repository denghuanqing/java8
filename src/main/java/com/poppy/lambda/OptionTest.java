package com.poppy.lambda;

import java.util.Optional;

/**
 * @author poppy
 * @date 2018/5/28 17:02
 */
public class OptionTest {
    public static void main(String[] args) {
        int i=5;
        // 1.如果i为空报异常，不为空包装i
        Optional<Integer> i1 = Optional.of(i);

        //2.如果i为空，返回空的包装对象  不为空返回包装i
        Optional<Integer> i2 = Optional.ofNullable(i);

        //3.构造一个空的包装对象
        Optional<Object> empty = Optional.empty();

        //4.判断是否有值
        boolean present = empty.isPresent();

        // 5. 如果empty没有值返回 5
        Object o = empty.orElse(5);
        System.out.println(o.toString());

        // 6. 有值直接返回，没有抛出异常
        Object o1 = empty.get();

        // 7.存在直接返回，不存在抛出异常。
        Object mm = empty.orElseThrow(() -> new RuntimeException("对象不能为空"));
        System.out.println(mm);

    }
}

package com.poppy.patch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

/**
 * @author poppy
 * @date 2018/6/26 23:50
 * 巧用设计模式 改造一系列的判断条件
 * 类似于策略设计模式  但是策略设计模式最终只会选择一种策略来执行
 */
public class Test {
    public static void main(String[] args) {
        Collection<Function<Integer, Boolean>> conditions = new ArrayList<>();
        conditions.add(id -> new Mobile().can(id));
        conditions.add(id -> new SsjVersion().can(id));

        System.out.println(judge(1, conditions));

    }

    public static boolean judge(Integer context, Collection<Function<Integer, Boolean>> conditions) {
        for (Function<Integer, Boolean> cond : conditions) {
            if (!cond.apply(context)) {
                return false;
            }
        }
        return true;
    }
}



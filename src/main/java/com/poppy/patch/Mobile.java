package com.poppy.patch;

/**
 * @author poppy
 * @date 2018/6/26 23:49
 */
public class Mobile implements Judge {
    @Override
    public boolean can(int i) {
        if (i < 2) {
            return false;
        }
        return true;
    }
}

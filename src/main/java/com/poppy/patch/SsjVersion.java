package com.poppy.patch;

/**
 * @author poppy
 * @date 2018/6/26 23:49
 */
public class SsjVersion implements Judge {
    @Override
    public boolean can(int i) {
        if (i < 3) {
            return false;
        }
        return true;
    }
}

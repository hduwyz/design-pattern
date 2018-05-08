package org.zxb.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}

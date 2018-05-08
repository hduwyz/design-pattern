package org.zxb.pattern.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

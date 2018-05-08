package org.zxb.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

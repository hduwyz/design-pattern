package org.zxb.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

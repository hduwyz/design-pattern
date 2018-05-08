package org.zxb.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

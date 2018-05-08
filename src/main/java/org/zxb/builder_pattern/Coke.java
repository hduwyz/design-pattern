package org.zxb.builder_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

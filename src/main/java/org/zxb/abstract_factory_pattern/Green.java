package org.zxb.abstract_factory_pattern;

/**
 * Created by wangyz on 2018/3/28.
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

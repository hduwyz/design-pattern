package org.zxb.abstract_factory_pattern;

/**
 * Created by wangyz on 2018/3/28.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

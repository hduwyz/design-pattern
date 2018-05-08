package org.zxb.factory_pattern;

/**
 * Created by wangyz on 2018/3/28.
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

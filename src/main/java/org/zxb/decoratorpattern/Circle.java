package org.zxb.decoratorpattern;


/**
 * Created by wangyz on 2018/3/28.
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

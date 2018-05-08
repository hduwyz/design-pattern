package org.zxb.prototype_pattern;

/**
 * Created by wangyz on 2018/3/30.
 */
public class Circle extends Shape{

    public Circle(){
        type = "Circle";
    }
    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

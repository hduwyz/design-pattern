package org.zxb.prototype_pattern;

/**
 * Created by wangyz on 2018/3/30.
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

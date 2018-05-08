package org.zxb.prototype_pattern;

/**
 * Created by wangyz on 2018/3/30.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

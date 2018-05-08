package org.zxb.abstract_factory_pattern;

/**
 * Created by wangyz on 2018/3/28.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shapeType) ;
}

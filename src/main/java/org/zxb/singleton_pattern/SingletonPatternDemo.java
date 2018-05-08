package org.zxb.singleton_pattern;

/**
 * Created by wangyz on 2018/3/29.
 */
public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}

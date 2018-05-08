package org.zxb.proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
    }
}

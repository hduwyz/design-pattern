package org.zxb.pattern.bridgepattern;

public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCicle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCicle.draw();
    }
}

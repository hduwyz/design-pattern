package org.zxb.Thread;

public class Thread1 extends Thread{
    private String name;

    private Thread1(String name){
        this.name = name;
    }

    @Override
    public void run(){
        for (int i = 0; i<5;i++){
            System.out.println(name + "ÔËÐÐ£º" + i);
            try{
                sleep((int)Math.random()*10);
            }catch (InterruptedException e){
               e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Thread1 th1 = new Thread1("test1");
        Thread1 th2 = new Thread1("test2");
        th1.start();
        th2.start();
    }
}

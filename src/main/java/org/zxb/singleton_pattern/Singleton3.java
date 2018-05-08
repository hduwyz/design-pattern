package org.zxb.singleton_pattern;

/**
 * Created by wangyz on 2018/3/29.
 * 4、双检锁/双重校验锁（DCL，即 double-checked locking）
 JDK 版本：JDK1.5 起

 是否 Lazy 初始化：是

 是否多线程安全：是

 实现难度：较复杂

 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 getInstance() 的性能对应用程序很关键。
 */
public class Singleton3 {
    private volatile static Singleton3 instance;
    private Singleton3(){}

    public Singleton3 getInstance(){
        if (instance==null){
            synchronized (Singleton3.class){
                if (instance==null){
                    return new Singleton3();
                }
            }
        }
        return instance;
    }
}

package com.example.jmm;

/**
 * 双重 check 的单例
 * 1.分配对象内存空间
 * 2.初始化对象
 * 3.设置 instance 指向刚分配的内存地址，此时 instance ！= null
 *
 * 指令重排的情况下可能会出现问题，顺序可能是2-3-1 or 1-2-3, volatile 可控制指令重排
 */
public class DoubleCheckLock {

    private static volatile DoubleCheckLock instanse;

    private DoubleCheckLock(){}

    public static DoubleCheckLock getInstance(){
        if(instanse == null){

            synchronized (DoubleCheckLock.class){
                if(instanse == null){
                    instanse = new DoubleCheckLock();
                }
            }
        }

        return instanse;
    }
}

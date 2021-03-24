package com.example.jmm;

/**
 * jmm 有三大特性可见性、原子性、有序性
 *
 * volatile 保证共享变量的及时可见
 */
public class VolatileVisibilitySample {

    volatile boolean flag = false;

    public void save(){
        this.flag = true;
        String threadName = Thread.currentThread().getName();

        System.out.println("线程："+threadName+"修改共享变量 flag");
    }

    public void load(){
        String threadName = Thread.currentThread().getName();
        while(!flag){

        }
        System.out.println("线程："+threadName+"修改共享变量 flag");
    }

    public static void main(String[] args) {
        VolatileVisibilitySample visibilitySample = new VolatileVisibilitySample();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                visibilitySample.save();
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                visibilitySample.load();
            }
        });

        threadB.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadA.start();

    }
}

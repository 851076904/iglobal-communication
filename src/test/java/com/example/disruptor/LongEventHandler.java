package com.example.disruptor;


import com.lmax.disruptor.EventHandler;

/**
 * 定义消费者
 */
public class LongEventHandler implements EventHandler<LongEvent> {

    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b){
        System.out.println("消费者："+longEvent.getValue());
    }
}

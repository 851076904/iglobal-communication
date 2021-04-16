package com.example.disruptor;

/**
 * 定义事件，通过 disruptor 进行交换的数据类型
 */
public class LongEvent {

    private Long value;

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }
}

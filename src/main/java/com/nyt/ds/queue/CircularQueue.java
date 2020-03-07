package com.nyt.ds.queue;


import java.util.Arrays;

/**
 * 循环队列
 *
 * 使用数组实现
 */
public class CircularQueue {

    //数组
    private String[] items;


    //容量
    private int capacity;

    //头指针
    private int head=0;

    //尾指针
    private int tail=0;

    public CircularQueue(int capacity) {
        items=new String[capacity];
        this.capacity = capacity;
    }

    //出队
    public String dequeue(){
        //队空的情况下
        if(head==tail) return null;
        String ret=items[head];
        head=(head+1)%capacity;
        return ret;
    }

    //入队
    public boolean enqueue(String item){
        //队满的情况
        if((tail+1)%capacity==head) return false;
        items[tail]=item;
        tail=(tail+1)%capacity;
        return true;
    }

    @Override
    public String toString() {
        return "CircularQueue{" +
                "items=" + Arrays.toString(items) +
                ", capacity=" + capacity +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }
}

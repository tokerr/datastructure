package com.nyt.ds.queue;

public class Test {

    public static void main(String[] args) {

        CircularQueue circularQueue = new CircularQueue(5);

        for (int i = 0; i < 6; i++) {
            System.out.println(circularQueue.enqueue(i+""));
        }
        System.out.println(circularQueue);


        System.out.println(circularQueue.dequeue());
        System.out.println(circularQueue.dequeue());

        System.out.println(circularQueue.enqueue("nyt"));
        System.out.println(circularQueue.enqueue("nyt233"));

        System.out.println(circularQueue.dequeue());

        System.out.println(circularQueue);

    }
}

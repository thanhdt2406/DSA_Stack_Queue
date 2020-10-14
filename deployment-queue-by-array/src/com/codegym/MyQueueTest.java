package com.codegym;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.displayQueue();
        System.out.println();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.displayQueue();
    }
}

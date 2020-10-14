package com.codegym;

public class MyLinkedListQueueTest {

    public static void main(String[] args) {
	    MyLinkedListQueue queue = new MyLinkedListQueue();
	    queue.enqueue(12);
	    queue.enqueue(1);
	    queue.enqueue(112);
	    queue.enqueue(11214);
	    queue.enqueue(11);
	    queue.dequeue();
	    queue.dequeue();
        System.out.println("Dequeued item 1 is "+queue.dequeue().key);
        System.out.println("Dequeued item 2 is "+queue.dequeue().key);
    }
}

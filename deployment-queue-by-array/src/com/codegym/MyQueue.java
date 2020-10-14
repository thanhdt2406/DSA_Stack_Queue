package com.codegym;

public class MyQueue {
    private static final int DEFAULT_SIZE = 10;
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue() {
        this.capacity = DEFAULT_SIZE;
        queueArr = new int[capacity];
    }

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[capacity];
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isQueueFull() {
        return this.currentSize == this.capacity;
    }

    public boolean isQueueEmpty() {
        return this.currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow! Cannot enqueue!");
            return;
        }

        tail++;
        if (tail == this.capacity) {
            tail = 0;
        }
        queueArr[tail] = item;
        currentSize++;
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow! Cannot dequeue!");
            return;
        }

        head++;
        if (head == capacity) {
            head = 0;
        }
        currentSize--;
    }

    public void displayQueue() {
        if (isQueueEmpty()) {
            System.out.println("Empty queue!");
            return;
        }

        for (int i = 0, j = head; i < currentSize; i++) {
            if (j == capacity) {
                j = 0;
            }
            System.out.println("Element " + j + ": " + queueArr[j++]);
        }
    }
}

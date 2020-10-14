package com.codegym;

public class MyQueue<T> {
    Node front;
    Node rear;

    public MyQueue() {

    }

    public MyQueue(T e) {
        Node temp = new Node(e);
        this.front = this.rear = temp;
        this.rear.next = this.front;
    }

    public boolean isEmpty() {
        return this.front == null;
    }

    public void enqueue(T element) {
        if (isEmpty()) {
            this.front = this.rear = new Node(element);
        } else {
            Node temp = new Node(element);
            this.rear.next = temp;
            this.rear = temp;
            this.rear.next = this.front;
        }
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node temp = this.front;
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.next;
            this.rear.next = this.front;
        }
        return (T) temp.data;
    }

    public void displayQueue(){
        if(isEmpty()){
            System.out.println("Empty list");
            return;
        }

        Node temp = this.front;
        int i=0;
        do{
            System.out.println("Element "+(i++)+": "+temp.data);
            temp=temp.next;
        }
        while(temp!=this.front);
    }
}

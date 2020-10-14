package com.codegym;

import java.util.EmptyStackException;

public class MyStack {
    private static final int DEFAULT_SIZE = 10;
    private int[] arrStack;
    private int size;
    private int index = -1;

    public MyStack() {
        this.size = DEFAULT_SIZE;
        arrStack = new int[this.size];
    }

    public MyStack(int size) {
        this.size = size;
        arrStack = new int[this.size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Overflow! Cannot push!");
            return;
        }

        index++;
        arrStack[index] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        index--;
        return arrStack[index + 1];
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == this.size - 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty list!");
            return;
        }

        for(int i=index;i>=0;i--){
            System.out.println("Element "+i+": "+arrStack[i]);
        }
    }
}

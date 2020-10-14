package com.codegym;

public class MyStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        System.out.println();

        System.out.println(stack.pop());
        stack.pop();
        stack.display();
    }
}

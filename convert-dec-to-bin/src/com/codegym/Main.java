package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Long> stack = new Stack<>();
        long number = 2121;
        for(int i=0;i<8||number>0;i++){
            stack.push(number % 2);
            number = (long) Math.floor(number / 2);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

package com.codegym;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        str = str.toLowerCase();
        String[] strArr = str.split("");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for(int i=0;i<strArr.length;i++){
            stack.push(strArr[i]);
            queue.offer(strArr[i]);
        }

        boolean isPalindrome = true;
        for(int i=0;i< strArr.length;i++){
            if(!stack.pop().equals(queue.remove())){
                isPalindrome = false;
            }
        }

        if(isPalindrome){
            System.out.println("'"+str+"'" +" is a palindrome");
        } else{
            System.out.println("'"+str+"'" +" isn't a palindrome");
        }
    }
}

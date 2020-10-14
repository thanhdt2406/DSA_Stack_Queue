package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String[] strArr = str.split("");

        Stack<String> stack = new Stack<>();

        boolean isGood = true;

        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals("(")){
                stack.push(strArr[i]);
            }
            if(strArr[i].equals(")")){
                if(stack.isEmpty()){
                    isGood = false;
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            isGood = false;
        }

        if(isGood){
            System.out.println("Well");
        } else{
            System.out.println("Bad");
        }
    }
}

package com.codegym;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArr(arr);
        Stack<Integer> iStack = new Stack();

        //push into stack
        for (int i = 0; i < arr.length; i++) {
            iStack.push(arr[i]);
        }

        //pop stack back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = iStack.pop();
        }
        printArr(arr);

        String str = "This is a paragraph.";
        String[] strArr = str.split(" ");
        Stack<String> wStack = new Stack();
        for(int i=0;i<strArr.length;i++){
            wStack.push(strArr[i]);
        }
        for(int i=0;i<strArr.length;i++){
            strArr[i] = wStack.pop();
        }
        str = String.join(" ",strArr);
        System.out.println(str);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}

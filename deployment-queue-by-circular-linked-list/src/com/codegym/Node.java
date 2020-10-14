package com.codegym;

public class Node<T> {
    public T data;
    public Node next;

    public Node(){

    }

    public Node(T data){
        this.data=data;
        this.next = null;
    }
}

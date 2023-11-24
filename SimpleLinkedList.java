package com.demo;

public class SimpleLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(30);
        linkedList.insert(70);
        System.out.print("Linked List: ");
        linkedList.displayData();
    }
}

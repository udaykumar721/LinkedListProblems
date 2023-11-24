package com.demo;

public class InsertNodeLinkedList {
    static Node head;
    public static void insertNodeBetween(int prevData, int newData, int nextData) {
        Node newNode = new Node(newData);
        Node current = head;
        while (current != null && current.data != prevData) {
            current = current.next;
        }
        if (current != null) {
            Node nextNode = current.next;
            current.next = newNode;
            newNode.next = nextNode;
        } else {
            System.out.println("Node with data " + prevData + " not found");
        }
    }
    public static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertNodeLinkedList insertNodeLinkedList = new InsertNodeLinkedList();

        // Creating the linked list
        InsertNodeLinkedList.insertNodeBetween(56, 30, 70);

        // Displaying the linked list
        System.out.print("Final Sequence: ");
        InsertNodeLinkedList.display();
    }
}

package com.demo;

public class AppendNode {
    Node head;
    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        AppendNode appendLinkedList = new AppendNode();

        appendLinkedList.appendNode(56);
        appendLinkedList.appendNode(30);
        appendLinkedList.appendNode(70);

        // Displaying the linked list
        System.out.print("LinkedList Sequence: ");
        appendLinkedList.display();
    }
}

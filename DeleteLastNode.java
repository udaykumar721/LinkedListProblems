package com.demo;

public class DeleteLastNode {
    Node head;
    Node tail;

    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void popLast() {
        if (head == null) {
            System.out.println("LinkedList is empty. Cannot popLast.");
            return;
        }

        if (head.next == null) {
            // Only one element in the list
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        tail = current;
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
        DeleteLastNode deleteLastNode = new DeleteLastNode();

        // Creating the linked list
        deleteLastNode.appendNode(56);
        deleteLastNode.appendNode(30);
        deleteLastNode.appendNode(70);

        // Displaying the original linked list
        System.out.print("Original Sequence: ");
        deleteLastNode.display();

        // Deleting the last element (popLast)
        deleteLastNode.popLast();

        // Displaying the final linked list
        System.out.print("Final Sequence: ");
        deleteLastNode.display();
    }
}

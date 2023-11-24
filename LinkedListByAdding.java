package com.demo;

class LinkedListDetails {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class LinkedListByAdding {
    public static void main(String[] args) {
        LinkedListDetails linkedListDetails = new LinkedListDetails();
        linkedListDetails.addNode(70);
        linkedListDetails.addNode(30);
        linkedListDetails.addNode(56);
        System.out.print("LinkedList Sequence: ");
        linkedListDetails.display();
    }
}

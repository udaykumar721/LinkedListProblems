package com.demo;

//public class SortLinkedList {
//}
class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class SortedLinkedList<T extends Comparable<T>> {
    Node<T> head;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || data.compareTo(head.data) <= 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && data.compareTo(current.next.data) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating the sorted linked list
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
        sortedList.add(56);
        sortedList.add(30);
        sortedList.add(40);
        sortedList.add(70);

        // Displaying the final sorted linked list
        System.out.print("Final Sequence: ");
        sortedList.display();
    }
}


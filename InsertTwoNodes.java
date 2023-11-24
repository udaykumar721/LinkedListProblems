package com.demo;

public class InsertTwoNodes {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(int key, int newData) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                Node newNode = new Node(newData);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public Node searchNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return current; // Node with key found
            }
            current = current.next;
        }
        return null; // Node with key not found
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
        InsertTwoNodes insertTwoNodes = new InsertTwoNodes();
        insertTwoNodes.addNode(70);
        insertTwoNodes.addNode(30);
        insertTwoNodes.addNode(56);

        // Searching for a node with value 30
        int keyToSearch = 30;
        Node node30 = insertTwoNodes.searchNode(keyToSearch);

        if (node30 != null) {
            // Inserting 40 after the node with value 30
            insertTwoNodes.insertAfter(keyToSearch, 40);
        } else {
            System.out.println("Node with key " + keyToSearch + " not found in the linked list.");
        }

        // Displaying the final linked list
        System.out.print("Final Sequence: ");
        insertTwoNodes.display();
    }
}

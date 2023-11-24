package com.demo;

public class SearchNode {
    Node head;

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

    public static void main(String[] args) {
        SearchNode searchNode = new SearchNode();
        searchNode.addNode(70);
        searchNode.addNode(30);
        searchNode.addNode(56);

        // Searching for a node with value 30
        int keyToSearch = 56;
        Node result = searchNode.searchNode(keyToSearch);

        if (result != null) {
            System.out.println("Node with key " + keyToSearch + " found in the linked list.");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found in the linked list.");
        }
    }
}

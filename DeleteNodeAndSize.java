package com.demo;

public class DeleteNodeAndSize {
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

    public void deleteNode(int key) {
        Node current = head;
        Node prev = null;

        // Search for the node with the specified key
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the node with the key is found, delete it
        if (current != null) {
            if (prev == null) {
                // If the node to be deleted is the head
                head = current.next;
            } else {
                prev.next = current.next;
            }
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

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
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
        DeleteNodeAndSize deleteNodeAndSize = new DeleteNodeAndSize();
        deleteNodeAndSize.addNode(70);
        deleteNodeAndSize.addNode(30);
        deleteNodeAndSize.addNode(56);

        // Inserting 40 after the node with value 30
        deleteNodeAndSize.insertAfter(30, 40);

        // Displaying the original linked list
        System.out.print("Original Sequence: ");
        deleteNodeAndSize.display();

        // Searching for a node with value 40
        int keyToSearch = 40;
        Node node40 = deleteNodeAndSize.searchNode(keyToSearch);

        if (node40 != null) {
            // Deleting the node with value 40
            deleteNodeAndSize.deleteNode(keyToSearch);
        } else {
            System.out.println("Node with key " + keyToSearch + " not found in the linked list.");
        }

        // Displaying the final linked list
        System.out.print("Final Sequence: ");
        deleteNodeAndSize.display();

        // Showing the size of the linked list
        System.out.println("Size of LinkedList: " + deleteNodeAndSize.size());
    }
}

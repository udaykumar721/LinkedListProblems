package com.demo;

class DeleteNode {
    static Node head;

    public static void pop() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("LinkedList is empty. Cannot pop.");
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
        DeleteNode deleteNode = new DeleteNode();

        // Creating the linked list
        DeleteNode.pop(); // This will print a message since the list is initially empty

        deleteNode.head = new Node(56);
        deleteNode.head.next = new Node(30);
        deleteNode.head.next.next = new Node(70);

        // Displaying the original linked list
        System.out.print("Original Sequence: ");
        deleteNode.display();

        // Deleting the first element (pop)
        deleteNode.pop();

        // Displaying the final linked list
        System.out.print("Final Sequence: ");
        deleteNode.display();
    }
}

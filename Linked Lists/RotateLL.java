// Java program to rotate a singly linked list to the left by k places

// Asked by Accolite, Amazon, Microsoft and MakeMyTrip

class Node {
    int data;
    Node next;

    Node (int d) {
        data = d;
        next = null;
    }
}

public class RotateLL {
    public static Node rotate(Node head, int k) {
        if (k == 0 || head == null)
            return head;

        Node curr = head;
        int len = 1;

        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        k = k % len;
        if (k == 0)
            return head;

        curr.next = head;

        curr = head;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        head = curr.next;
        curr.next = null;

        return head;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int k = 6;

        System.out.println("Initial Linked List:");
        printList(head);

        head = rotate(head, k);

        System.out.println("\nLinked List after rotating " + k + " places to the left:");
        printList(head);
    }
}

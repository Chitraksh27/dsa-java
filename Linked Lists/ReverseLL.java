// Java program to reverse a linked list and return the head of reversed list

// Asked by Paytm, VMWare, Zoho, Accolite, Amazon, Microsoft, Samsung, Snapdeal, D-E-Shaw, MakeMyTrip, Teradata, Walmart, Goldman Sachs, Intuit, Adobe, SAP Labs, Tejas Network, Cisco, Qualcomm, Cognizant, Mahindra Comviva and IgniteWorld

class Node {
    int data;
    Node next;

    Node (int value) {
        this.data = value;
        next = null;
    }
}

public class ReverseLL {
    static Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node revNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return revNode;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Given Linked List: ");
        printList(head);

        head = reverseList(head);

        System.out.print("\nReversed Linked List: ");

        printList(head);
    }
}

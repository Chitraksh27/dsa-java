// Java program to reverse a linked list

// Asked by Paytm, VMWare, Zoho, Accolite, Amazon, Microsoft, Samsung, Snapdeal, D-E-Shaw, MakeMyTrip, Teradata, Walmart, Goldman Sachs, Intuit, Adobe, SAP Labs, Tejas Network, Cisco, Qualcomm, Cognizant, Mahindra Comviva and IgniteWorld

class Node {
    int data;
    Node next;
    Node (int val) {
        this.data = val;
    }
}

public class ReverseLL {
    static Node reverseList(Node head) {
        if (head == null || head.next == null)
            return head;
        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    static void printlist(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Given linked list: ");
        printlist(head);

        head = reverseList(head);

        System.out.println("\nReversed Linked List: ");
        printlist(head);
    }
}

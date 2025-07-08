//Java program to merge two sorted linked lists and return the head of the sorted merged list

// Asked by Zoho, Flipkart, Accolite, Amazon, Microsoft, Samsung, FactSet, MakeMyTrip, Oracle, Brocade, Synopsys, OATS Systems and Belzabar

class Node {
    int data;
    Node next;

    Node (int d) {
        data = d;
        next = null;
    }
}

public class MergeSortedLL {
    static Node sortedMerge(Node head1, Node head2) {
        if (head1 == null)
            return head2;

        if (head2 == null)
            return head1;

        if (head1.data <= head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        }
        else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.print("First Linked List: ");
        printList(head1);

        System.out.print("\nSecond Linked List: ");
        printList(head2);

        Node mergedHead = sortedMerge(head1, head2);

        System.out.print("\nMerged Linked List: ");

        printList(mergedHead);
    }
}

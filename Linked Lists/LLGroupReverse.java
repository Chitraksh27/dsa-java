// Java program to reverse every k node of a linked list

// Asked by Paytm, VMWare, Accolite, Amazon, Microsoft, Snapdeal, Hike, MakeMyTrip, Walmart, Goldman Sachs, Adobe, SAP Labs

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LLGroupReverse {
    static Node reverseKNodes(Node head, int k) {
        Node curr = head, prev = null, next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        return prev;
    }
    static void printList(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static Node reverseKGroup(Node head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }
        Node groupHead = null;
        Node newHead = null;

        Node curr = head;
        int count = 0;

        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }
        groupHead = reverseKNodes(head, k);

        if (newHead == null)
            newHead = groupHead;

        head.next = reverseKGroup(curr, k);

        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 3;

        System.out.println("Original Linked List: ");
        printList(head);

        Node newHead = reverseKGroup(head, k);

        System.out.println("\nModified Linked List: ");
        printList(newHead);
    }
}

// Java program to detect a loop in a linked list

// Asked by Paytm, VMWare, Accolite, Amazon, OYO Rooms, Samsung, Snapdeal, D-E-Shaw, Hike, MakeMyTrip, Walmart, MAQ Software, Adobe, SAP Labs, Qualcomm, Veritas, Mahindra Comviva and Lybrate

class Node {
    int data;
    Node next;

    Node (int d) {
        data = d;
        next = null;
    }
}

public class DetectLoop {
    public static boolean detectLoop(Node head) {
        Node tortoise = head;
        Node hare = head;

        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if (tortoise == hare)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = head.next.next;

        if (detectLoop(head)) {
            System.out.println("Cycle present");
        }
        else {
            System.out.println("No cycle present");
        }
    }
}

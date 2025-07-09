// Java program to find the point where two linked lists intersect

// Asked by VMWare, Flipkart, Accolite, Amazon, Microsoft, Snapdeal, D-E-Shaw, FactSet, MakeMyTrip, Visa, Goldman Sachs, MAQ Software, Adobe, Qualcomm

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class IntersectioninLL {
    public static Node intersectPoint(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {
            p1 = (p1 == null) ? head2 : p1.next;
            p2 = (p2 == null) ? head1 : p2.next;
        }
        return p1;
    }
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = new Node(8);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);
        

        head2.next.next.next = head1.next.next;

        Node intersect = intersectPoint(head1, head2);

        if (intersect != null) {
            System.out.println("Intersecting Node: " + intersect.data);
        } else {
            System.out.println("No intersection");
        }
    }
}

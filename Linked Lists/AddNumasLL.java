// Java program to add two numbers represented as linked lists

// Asked by Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Qualcomm

class Node {
    int data;
    Node next;

    Node (int x) {
        this.data = x;
        this.next = null;
    }
}

public class AddNumasLL {
    static Node reverse(Node head) {
        Node prev = null, curr = head, nxt = null;

        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    static Node trimLeadingZeros(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head;
    }
    static Node ATNRec(Node head1, Node head2, int[] carry) {
        int sum = carry[0];
        if (head1 == null && head2 == null && carry[0] == 0)
            return null;

        if (head1 != null) {
            sum += head1.data;
            head1 = head1.next;
        }

        if (head2 != null) {
            sum += head2.data;
            head2 = head2.next;
        }

        carry[0] = sum / 10;

        Node result = new Node (sum % 10);
        result.next = ATNRec(head1, head2,carry);

        return result;
    }
    static Node addTwoLists(Node num1, Node num2) {
        num1 = trimLeadingZeros(num1);
        num2 = trimLeadingZeros(num2);

        num1 = reverse(num1);
        num2 = reverse(num2);

        int[] carry = new int[1];

        Node result = ATNRec(num1, num2, carry);

        if (carry[0] != 0) {
            Node newNode = new Node(carry[0]);
            newNode.next = result;
            result = newNode;
        }
        return reverse(result);
    }
    public static void main(String[] args) {
        Node num1 = new Node(4);
        num1.next = new Node(5);

        Node num2 = new Node(3);
        num2.next = new Node(4);
        num2.next.next = new Node(5);

        Node result = addTwoLists(num1, num2);

        Node temp = result;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}

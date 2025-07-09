// Java program to check if a linked list is a palindrome

// Asked by Accolite, Amazon, Microsoft, Snapdeal, MakeMyTrip, Adobe, Yodlee Infotech, KLA Tencor and Kritikal Solutions

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int val) {
        this.data = val;
        this.next = null;
    }
}

public class PalindromeLL {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) 
            return true;

        Stack<Integer> st = new Stack<>();
        Node curr = head;

        while (curr != null) {
            st.push(curr.data);
            curr = curr.next;
        }

        Node current = head;

        while(current != null) {
            int top = st.pop();

            if (current.data != top)
                return false;
            
            current = current.next;
        }
        
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}

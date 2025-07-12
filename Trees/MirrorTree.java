// Java program to convert the binary tree to its Mirror tree

// Asked by Paytm, VMWare, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung, Snapdeal, Ola Cabs, Walmart, Goldman Sachs, Adobe, Google, SAP Labs, Myntra, Belzabar, eBay, PropTiger

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node (int x) {
        data = x;
        left = right = null;
    }
}

public class MirrorTree {
    static void mirror(Node node) {
        if (node == null)
            return;

        mirror(node.left);
        mirror(node.right);

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
    static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.print("N ");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr == null) {
                System.out.print("N ");
                continue;
            }
            System.out.print(curr.data + " ");
            queue.add(curr.left);
            queue.add(curr.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printLevelOrder(root);
        System.out.println();
        mirror(root);
        System.out.println();
        printLevelOrder(root);
    }
}

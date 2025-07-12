// Java program to find the height of a binary tree

// Asked by VMWare, Zoho, Amazon, Microsoft, Snapdeal, D-E-Shaw, FactSet, MakeMyTrip, Teradata, Synopsys, CouponDunia, Cadence India, Monotype Solutions and FreeCharge

class Node {
    int data;
    Node left, right;

    Node (int item) {
        data = item;
        left = right = null;
    }
}

public class HeightofTree {
    static int height(Node node) {
        if (node == null)
            return -1;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(height(root));
    }
}

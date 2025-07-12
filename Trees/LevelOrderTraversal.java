// Java program to perform level order traversal of a binary tree

// Asked by Flipkart, Morgan Stanley, Accolite, Amazon, Microsoft, Samsung, D-E-Shaw, Ola Cabs, Payu, Adobe, Cisco and Qualcomm

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class LevelOrderTraversal {
    static void levelOrderRec(Node root, int level, ArrayList<ArrayList<Integer>> result) {
        if (root == null)
            return;

        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }

        result.get(level).add(root.data);

        levelOrderRec(root.left, level + 1, result);
        levelOrderRec(root.right, level + 1, result);
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        levelOrderRec(root, 0, result);

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(12);
        root.right = new Node(13);

        root.left.left = new Node(7);
        root.left.right = new Node(14);

        root.right.right = new Node(2);

        root.left.left.left = new Node(17);
        root.left.left.right = new Node(23);

        root.left.right.left = new Node(27);
        root.left.right.right = new Node(3);

        root.right.right.left = new Node(8);
        root.right.right.right = new Node(11);

        LevelOrderTraversal tree = new LevelOrderTraversal();
        ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);

        for (ArrayList<Integer> level : res) {
            System.out.print("[");
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i));
                if (i < level.size() - 1)
                    System.out.print(", ");
            }
            System.out.print("] ");
        }
    }
}

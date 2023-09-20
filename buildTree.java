import java.util.LinkedList;
import java.util.Queue;

public class buildTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node temp = new Node(nodes[idx]);
            temp.left = buildTree(nodes);
            temp.right = buildTree(nodes);
            return temp;
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static Queue<Node> queue = new LinkedList<>();

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return root.data;
        } else {
            return root.data + sumNodes(root.left) + sumNodes(root.right);
        }
    }

    public static class InfoDiameter {
        public int height;
        public int diameter;

        public InfoDiameter(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static InfoDiameter diameter(Node root) {
        InfoDiameter cur = new InfoDiameter(0, 0);
        if (root == null) {
            return cur;
        } else if (root.left == null && root.right == null) {
            cur.height = 1;
            cur.diameter = 1;
            return cur;
        } else {
            InfoDiameter left = diameter(root.left);
            InfoDiameter right = diameter(root.right);
            int height = Math.max(left.height, right.height) + 1;
            int diameter = Math.max(left.diameter, Math.max(right.diameter, left.height + right.height + 1));
            cur.height = height;
            cur.diameter = diameter;
            return cur;
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int arr[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = binaryTree.buildTree(arr);
        // binaryTree.preorder(root);
        // System.out.println();
        // binaryTree.inorder(root);
        // System.out.println();
        // binaryTree.postorder(root);
        // levelOrder(root);
        // System.out.println(height(root));
        // System.out.println(countNodes(root));
        // System.out.println(sumNodes(root));
        System.out.println(diameter(root).diameter);
    }
}

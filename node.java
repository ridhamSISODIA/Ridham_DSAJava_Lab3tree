package completebrackettree;

public class node {
    int value;
    node left;
    node right;

    static node newnode(int data) {
        node temp = new node();
        temp.value = data;
        temp.right = null;
        temp.left = null;
        return temp;
    }

    public node insert(node root, int value) {
        if (root == null)
            return newnode(value);

        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root; // Return the updated root
    }

    public static void displayTree(node root) {
        inOrderTraversal(root);
    }

    private static void inOrderTraversal(node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        node root = null;
        node node = new node();

        root = node.insert(root, 40);
        root = node.insert(root, 20);
        root = node.insert(root, 60);
        root = node.insert(root, 10);
        root = node.insert(root, 30);
        root = node.insert(root, 50);
        root = node.insert(root, 70);
        
        System.out.print("Binary Search Tree in-order traversal: ");
        displayTree(root);
    }
}

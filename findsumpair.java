package completebrackettree;

import java.util.HashSet;
import java.util.Set;

public class findsumpair {

    public static void main(String[] args) {
        // create the required tree
        node root = null;
        node node = new node();

        root = node.insert(root, 40);
        root = node.insert(root, 20);
        root = node.insert(root, 60);
        root = node.insert(root, 10);
        root = node.insert(root, 30);
        root = node.insert(root, 50);
        root = node.insert(root, 70);

        int sum;
		findpairwithsum(root, sum = 130); // Fixed method name
    }

    public static void findpairwithsum(node root, int sum) {
        Set<Integer> set = new HashSet<>();
        if (!findpairutil(root, sum, set)) {
            System.out.println("Pair not found");
        }
    }

    public static boolean findpairutil(node root, int sum, Set<Integer> set) {
        if (root == null) {
            return false;
        }

        if (findpairutil(root.left, sum, set)) {
            return true;
        } else {
            if (set.contains(sum - root.value)) {
                System.out.println("Pair found: " + root.value + " and " + (sum - root.value));
                return true;
            }
            set.add(root.value);
        }

        return findpairutil(root.right, sum, set);
    }
}

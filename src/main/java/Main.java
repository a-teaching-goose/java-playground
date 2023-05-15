import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        printAnimalRecord(getVetRecordBST());

        TreeNode<Animal> vetDB = getVetRecordBST();

        Animal record = searchAnimalRecord(vetDB, "Tommy");
        if (record != null) {
            System.out.println("Tommy is " + record.age + " years old.");
        }

        record = searchAnimalRecord(vetDB, "xyz");
        if (record != null) {
            System.out.println("xyz is " + record.age + " years old.");
        } else {
            System.out.println("xyz not found.");
        }

        printAnimalRecordWithoutRecursion(vetDB);
    }

    public static void printAnimalRecord(TreeNode<Animal> root) {
        if (root == null) {
            return;
        }

        printAnimalRecord(root.left);
        System.out.println(root);
        printAnimalRecord(root.right);
    }

    public static void printAnimalRecordWithoutRecursion(TreeNode<Animal> root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode<Animal>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<Animal> node = stack.pop();
            System.out.println(node.val);

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static Animal searchAnimalRecord(TreeNode<Animal> vetDB, String targetName) {
        if (vetDB == null) {
            return null;
        }

        Animal pet = vetDB.val;
        if (pet.name.equals(targetName)) {
            return pet;
        }

        if (targetName.compareTo(pet.name) < 0) {
            return searchAnimalRecord(vetDB.left, targetName);
        }
        return searchAnimalRecord(vetDB.right, targetName);
    }

    public static void printTree(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        // use recursion
        printTree(root.left);
        System.out.println(root);
        printTree(root.right);
    }

    //      1
    //     / \
    //    2   3
    //   / \   \
    //  4   5   6
    public static TreeNode<Integer> getFancyTree() {
        // 1st level
        TreeNode<Integer> root = new TreeNode<>(1);

        // 2nd level
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);

        // 3rd level
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);

        return root;
    }

    //      6
    //     / \
    //    3   8
    //   / \   \
    //  1   4   9
    public static TreeNode<Integer> getBinarySearchTree() {
        // 1st level
        TreeNode<Integer> root = new TreeNode<>(6);

        // 2nd level
        root.left = new TreeNode<>(3);
        root.right = new TreeNode<>(8);

        // 3rd level
        root.left.left = new TreeNode<>(1);
        root.left.right = new TreeNode<>(4);
        root.right.right = new TreeNode<>(9);

        return root;
    }

    public static TreeNode<Animal> getVetRecordBST() {
       /*
       create a binary search tree based on pet's name (alphabetically)

                     Natalie (cat)  // root of a tree
                    /              \
             David (dog)            Tommy (cat)
              /      \               /        \
    Alex (cat)   Emma (dog)    Sally (dog)   Whisky(dog)

        */
        // 1st level (root)
        TreeNode<Animal> root = new TreeNode<>(new Cat("Natalie", "male", 3));

        // 2nd level
        root.left = new TreeNode<>(new Dog("David", "male", 12, "Peng"));
        root.right = new TreeNode<>(new Cat("Tommy", "male", 5));

        // 3rd level
        root.left.left = new TreeNode<>(new Cat("Alex", "male", 2));
        root.left.right = new TreeNode<>(new Dog("Emma", "female", 8, "Seattle Humane"));

        root.right.left = new TreeNode<>(new Dog("Sally", "female", 4, "Peng"));
        root.right.right = new TreeNode<>(new Dog("Whisky", "male", 1, "Seattle Humane"));

        return root;
    }
}

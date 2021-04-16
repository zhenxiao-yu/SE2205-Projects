public class Driver {
    public static void main(String[] args) {
        LinkedBinaryTree binaryTree = new LinkedBinaryTree();
        binaryTree.add(5);
        binaryTree.add(4);
        binaryTree.add(20);
        binaryTree.add(15);
        binaryTree.add(3);
        binaryTree.add(1);
        binaryTree.add(50);
        binaryTree.add(7);
        binaryTree.add(9);
        binaryTree.inOrderTraversal();
        System.out.println("Searching for 7 in binary tree: " + binaryTree.find(7));
        System.out.println("Searching for 100 in binary tree: " + binaryTree.find(100));

    }
}


import java.util.Iterator;

public class LinkedBinaryTree<E> extends AbstractBinaryTree<E> {

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterable<Position<E>> position() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected static class Node<E> implements Position<E> {

        private E element;
        private Node<E> parent;
        private Node<E> left;
        private Node<E> right;

        public Node(E e, Node<E> parent, Node<E> left, Node<E> right) {
            this.element = e;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        //accessors
        public E getElement() {
            return this.element;
        }

        public Node<E> getParent() {
            return this.parent;
        }

        public Node<E> getLeft() {
            return this.left;
        }

        public Node<E> getRight() {
            return this.right;
        }

        // setters
        public void setElement(E e) {
            this.element = e;
        }

        public void setParent(Node<E> p) {
            this.parent = p;
        }

        public void setLeft(Node<E> l) {
            this.left = l;
        }

        public void setRight(Node<E> node) {
            this.right = node;
        }
    }

    protected Node<E> createNode(E e, Node<E> p, Node<E> l, Node<E> node) {
        return new Node<E>(e, p, l, node);
    }

    protected Node<E> root;

    private int size = 0;

    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) {
            throw new IllegalArgumentException();
        }
        Node<E> node = (Node<E>) p;
        if (node.getParent() == node) {
            throw new IllegalArgumentException();
        }
        return node;
    }

    public int size() {
        return size;
    }

    public Position<E> root() {
        return this.root;
    }

    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getParent();
    }

    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getLeft();
    }

    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return node.getRight();
    }

    public Position<E> addRoot(E e) throws IllegalStateException {
        if (!isEmpty()) {
            throw new IllegalStateException("Tree is not empty");
        }

        root = createNode(e, null, null, null);
        size = 1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> parent = validate(p);
        if (parent.getLeft() != null) {
            throw new IllegalArgumentException();
        }

        Node<E> child = createNode(e, parent, null, null);
        parent.setLeft(child);
        size++;
        return child;
    }

    public Position<E> addRight(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> parent = validate(p);
        if (parent.getRight() != null) {
            throw new IllegalArgumentException();
        }

        Node<E> child = createNode(e, parent, null, null);
        parent.setRight(child);
        size++;
        return child;
    }

    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }

    public void attach(Position<E> p, LinkedBinaryTree<E> t1,
            LinkedBinaryTree<E> t2) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (isInternal(p)) {
            throw new IllegalArgumentException("p must be a leaf");
        }

        size += t1.size() + t2.size();

        if (!t1.isEmpty()) {
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root = null;
            t1.size = 0;
        }

        if (!t2.isEmpty()) {
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root = null;
            t2.size = 0;
        }
    }

    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        if (numChildren(p) == 2) {
            throw new IllegalArgumentException("p has two children");
        }

        Node<E> child = (node.getLeft() != null ? node.getLeft() : node.getRight());

        if (child != null) {
            child.setParent(node.getParent());
        }
        if (node == root) {
            root = child;
        } else {
            Node<E> parent = node.getParent();
            if (node == parent.getLeft()) {
                parent.setLeft(child);
            } else {
                parent.setRight(child);
            }
        }
        size--;
        E temp = node.getElement();
        node.setElement(null);
        node.setLeft(null);
        node.setRight(null);
        node.setParent(node);

        return temp;
    }

    public LinkedBinaryTree() {
        root = null;
    }

    public void add(E element) {
        root = add(root, element); //if the tree empty, the given value is added to the root
    }

    //-------------the add method---------------------------------- 
    public Node<E> add(Node<E> node, E element) {
        //if the target node is empty, the given value is added to the target node
        if (node == null) {
            node = createNode(element, null, null, null);
        } //if the target node is not empty, the given value is compared to the value of the target node
        else {
            //If the given value is smaller than the value of the target node, it is added to the left child of the target node
            if ((int) element <= (int) node.getElement()) {
                node.left = add(node.left, element);
            } //If the given value is greater than the value of the target node, it is added to the right child of the target node
            else {
                node.right = add(node.right, element);
            }
        }
        return node; // return the target node
    }

    //--------------------------------------------------------------
    public boolean find(E e) {
        return find(root, (int) e); //start from the root
    }

    //-------------the find method----------------------------------
    private boolean find(Node node, int value) {
        boolean inTree = false;
        //loop through the entire tree structure using a while loop + recursion
        while ((node != null) && inTree == false) {
            int targertNodeValue = (int) node.getElement();
            //if the given value is smaller than the value of the target node, look for the given value on the left side of target node
            if (value < targertNodeValue) {
                node = node.getLeft();
                //if the given value is greater than the value of the target node, look for the given value on the right side of target node
            } else if (value > targertNodeValue) {
                node = node.getRight();
            } else {
                inTree = true;
                break;
            }
            inTree = find(node, value); //recursive call to iterate over the entire tree. 
        }
        return inTree; // return the a true or false value depending on wether or not the given value is a part of the tree. 
    }

    //-------------------------------------------------------------- 
    public void inOrderTraversal() {
        System.out.print("{");
        inOrderTraversal(root);
        System.out.println("}");
    }

    //printing the tree based on inorder trasversal
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            System.out.print(node.getElement() + ",");
            inOrderTraversal(node.getRight());
        }
    }

}

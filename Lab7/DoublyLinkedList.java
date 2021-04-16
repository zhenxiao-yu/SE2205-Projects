
public class DoublyLinkedList<E> {

    protected static class Node<E> {

        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head;
    private Node<E> trail;
    private Node<E> node;
    private int size = 0;
    int num = 0;
    String input;

    public DoublyLinkedList() {
        head = new Node<>(null, null, null);
        trail = new Node<>(null, head, null);
        head.setNext(trail);
    }

    //update methods
    public void addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> temp = new Node<>(e, pred, succ);
        pred.setNext(temp);
        succ.setPrev(temp);
        size++;
    }

    public void addLast(E e) {
        addBetween(e, trail.getPrev(), trail);
    }

    public void addFirst(E e) {
        addBetween(e, head, head.getNext());
    }

    public E remove(Node<E> node) {
        Node<E> pred = node.getPrev();
        Node<E> succ = node.getNext();
        succ.setPrev(pred);
        pred.setNext(succ);
        size--;
        return node.getElement();
    }

    public void setNode(int i) {
        if (i == 0) {
            node = first().getNext();
        }
        if (i == 1) {
            node = last().getPrev();
        }
    }

    public int size() {
        return size;
    }

    public Node<E> getCurrentNode() {
        return node;
    }

    public E incBack() {
        node = node.getPrev();
        return node.getElement();
    }

    public E getCurrentElement() {
        return node.getElement();
    }

    public Node<E> first() {
        return head;
    }

    public Node<E> last() {
        return trail;
    }

}

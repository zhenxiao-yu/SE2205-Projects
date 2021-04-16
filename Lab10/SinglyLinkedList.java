public class SinglyLinkedList<E> {

    private static class Node<E> {

        private E element;

        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public E last() {

        if (isEmpty()) {
            return null;
        } else {
            return tail.getElement();
        }
    }

    public E first() {
        if (isEmpty()) {
            return null;
        } else {
            return head.getElement();
        }
    }

    public void addFirst(E e) {

        Node<E> newNode = new Node<>(e, head);

        head = newNode;
        if (size == 0) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(E e) {

        Node<E> newNode = new Node<>(e, null);

        if (size == 0) {
            head = newNode;
        } else {

            tail.setNext(newNode);
        }

        tail = newNode;

        size++;
    }

    public E removeFirst() {

        if (isEmpty()) {
            return null;
        }

        E firstElement = head.getElement();

        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return firstElement;
    }

    public void printAll() {

        Node<E> currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getElement() + " ");

            currentNode = currentNode.getNext();
        }
    }
}

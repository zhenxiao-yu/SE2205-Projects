//implementing LinkedQueue 
public class LinkedQueue<E> implements Queue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();

    public LinkedQueue() {
    } 

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E first() {
        return list.first();
    }
    
    
    public E last() {
        return list.last();
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
    
    public void print(){
        list.printAll();
    }
}


import java.util.Comparator;

public class PriorityQueue<K, V> extends AbstractPriorityQueue<K, V> implements PQ<K, V> {

    private DoublyLinkedList<Entry<K, V>> list = new DoublyLinkedList<>();

    public PriorityQueue() {
        super();
    }

    public PriorityQueue(Comparator<K> comp) {
        super(comp);
    }

    public Entry<K, V> insert(K k, V v) throws IllegalArgumentException {
        checkK(k);
        list.setNode(1);
        Entry<K, V> temp = new QEntry<>(k, v);
        while (list.getCurrentNode().getPrev() != null && compareKeys(temp.getKey(), list.getCurrentElement().getKey()) < 0) {
            list.incBack();
        }
        if (list.getCurrentElement() == null) {
            list.addFirst(temp);
        } else {
            list.addBetween(temp, list.getCurrentNode(), list.getCurrentNode().getNext());
        }
        return temp;
    }

    public Entry<K, V> min() {
        if (isEmpty()) {
            return null;
        } else {
            return list.first().getNext().getElement();
        }
    }

    public Entry<K, V> removeMin() {
        if (isEmpty()) {
            return null;
        } else {
            return list.remove(list.first().getNext());
        }
    }

    public int size() {
        return list.size();
    }
}

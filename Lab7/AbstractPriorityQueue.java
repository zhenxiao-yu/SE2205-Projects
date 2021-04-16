import java.util.Comparator;

//interfaces
interface Entry<K, V> {
	K getKey();
	V getValue();
}

interface PQ<K, V> {
	int size();
	boolean isEmpty();
	Entry<K,
	V > insert(K k, V v) throws IllegalArgumentException;
	Entry<K,
	V > min();
	Entry<K,
	V > removeMin();
}
//abstract priority queue class
public abstract class AbstractPriorityQueue<K, V> implements PQ<K, V> {
	protected static class QEntry<K,
	V > implements Entry<K,
	V > {

		private K k;
		private V v;

		public QEntry(K k, V v) {
			this.k = k;
			this.v = v;
		}

		public K getKey() {
			return k;
		}

		public V getValue() {
			return v;
		}

		public void setKey(K k) {
			this.k = k;
		}

		public void setValue(V v) {
			this.v = v;
		}
	}

	private Comparator<K> comp;

	protected AbstractPriorityQueue(Comparator<K> comp) {
		this.comp = comp;
	}

	protected AbstractPriorityQueue() {
		this(new Comp<K> ());
	}

	protected int compare(QEntry<K, V> e1, QEntry<K, V> e2) {
		return comp.compare(e1.getKey(), e2.getKey());
	}

	protected int compareKeys(K k1, K k2) {
		return comp.compare(k1, k2);
	}

	protected boolean checkK(K k) throws IllegalArgumentException {
		try {
			return comp.compare(k, k) == 0;
		} catch (ClassCastException e) {
			throw new IllegalArgumentException("Invalid key!");
		}
	}

	public boolean isEmpty() {
		return size() == 0;
	}
}

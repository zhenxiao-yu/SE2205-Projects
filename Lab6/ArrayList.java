import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList < E > {
  public static final int maxElements = 20;
  private E[] arr;
  private int sz = 0;

  ArrayIterator innerLoop = new ArrayIterator();
  Iterator < E > walk = innerLoop.iterator();

  public ArrayList(int c) {
    arr = (E[]) new Object[c];
  }

  private class ArrayIterator implements Iterator < E > {
    private int count = 0;
    private boolean elementExist = false;

    public E next() throws NoSuchElementException {
      if (count == sz) {
        throw new NoSuchElementException("Element does not exist");
      }
      elementExist = true;
      return arr[count++];
    }
    
    
    public boolean hasNext() {
      boolean have = false;
      if (count < sz) {
        have = true;
      }
      return have;
    }

    @Override
    public void remove() throws IllegalStateException {
      if (!elementExist) {
        throw new IllegalStateException("Nothing to remove");
      }
      ArrayList.this.remove(count - 1);
      count--;
      elementExist = false;
    }

    public Iterator < E > iterator() {
      return new ArrayIterator();
    }
  }

  public int sz() {
    return sz;
  }

  public boolean isEmpty() {
    return sz == 0;
  }

  public E get(int index) throws IndexOutOfBoundsException {
    checkPoint(index, sz);
    return arr[index];
  }

  public E set(int i, E e) throws IndexOutOfBoundsException {
    checkPoint(i, sz);
    E temp = arr[i];
    arr[i] = e;
    return temp;
  }

  public void fillArray(E[] e) {
    for (int i = 0; i < e.length; i++) {
      add(0, e[i]);
    }
  }

  public void reset(int c) {
    sz = 0;
    walk = innerLoop.iterator();
  }

  public void resetIt() {
    walk = innerLoop.iterator();
  }

  public void add(int index, E element) throws IndexOutOfBoundsException {
    checkPoint(index, sz + 1);
    if (sz() >= arr.length) {
      increaseMax();
    }
    for (int i = sz - 1; i >= index; i--) {
      arr[i + 1] = arr[i];
    }
    arr[index] = element;
    sz++;
  }

  public E remove(int index) throws IndexOutOfBoundsException {
    checkPoint(index, sz);
    E temp = arr[index];
    for (int i = index; i < sz() - 1; i++) {
      arr[i] = arr[i + 1];
    }
    arr[sz - 1] = null;
    sz--;
    return temp;
  }

  public void increaseMax() {
    int newCap = arr.length * 2;
    E[] temp = (E[]) new Object[newCap];
    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    arr = temp;
  }

  public void checkPoint(int i, int n) throws IndexOutOfBoundsException {
    if (i < 0 || i >= n) {
      throw new IndexOutOfBoundsException("Invalid index: " + i);
    }
  }
}

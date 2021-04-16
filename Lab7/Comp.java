import java.util.Comparator;

public class Comp<E> implements Comparator<E> {
    public int compare(E data1, E data2) {
        return ((Comparable<E>) data1).compareTo(data2);
    }

}

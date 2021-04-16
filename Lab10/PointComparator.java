
import java.util.Comparator;

public class PointComparator<E> implements
        Comparator<E> {

//creating a lexicographic order between the points
    int Xa, Ya, Xb, Yb;

    @Override
    public int compare(Object a, Object b)
            throws ClassCastException {
        Xa = ((Point) a).getX();
        Ya = ((Point) a).getY();
        Xb = ((Point) b).getX();
        Yb = ((Point) b).getY();
        if (Xa != Xb) {
            return (Xa - Xb);
        } else {
            return (Ya - Yb);
        }
    }

    //creating the quick sort function
    public static <E> void quickSort(LinkedQueue<E> Seq, Comparator<E> comparator) {
        int n = Seq.size();
        if (n < 2) {
            return;
        }
        E pivot = Seq.first();

        LinkedQueue<E> A = new LinkedQueue<>();
        LinkedQueue<E> B = new LinkedQueue<>();
        LinkedQueue<E> C = new LinkedQueue<>();

        while (!Seq.isEmpty()) {
            E element = Seq.dequeue();
            int c = comparator.compare(element, pivot);
            if (c < 0) {
                A.enqueue(element);
            } else if (c == 0) {
                B.enqueue(element);
            } else {
                C.enqueue(element);
            }
        }
        quickSort(A, comparator);
        quickSort(C, comparator);
        while (!A.isEmpty()) {
            Seq.enqueue(A.dequeue());
        }
        while (!B.isEmpty()) {
            Seq.enqueue(B.dequeue());
        }
        while (!C.isEmpty()) {
            Seq.enqueue(C.dequeue());
        }

    }

}

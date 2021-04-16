public class Main {

    public static void main(String[] args) {

        LinkedQueue Points = new LinkedQueue();

        //creating points
        Point point1 = new Point(5, 6);
        Point point2 = new Point(7, 10);
        Point point3 = new Point(50, 4);
        Point point4 = new Point(7, 3);
        //adding points to Linked Queue
        Points.enqueue(point1);
        Points.enqueue(point2);
        Points.enqueue(point3);
        Points.enqueue(point4);

        System.out.println("Initial List: ");
        Points.print();

        System.out.println("\n"); //format output

        //Send the list of points and an object of the PointComparator class to the quick-sort function
        PointComparator.quickSort(Points, new PointComparator());
        System.out.println("Sorted List: ");
        Points.print();

    }
}

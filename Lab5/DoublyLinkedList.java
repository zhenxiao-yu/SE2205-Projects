import java.util.ArrayList;
import java.util.Collections;

public class DoublyLinkedList {
    class Node {
        public int data;
        public Node next;
        public Node prev;
        public Node(int data) {
            this.data = data;
        }
    }
    
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
    //allow user to attach new elements to the back of the list
    public void addBackElement(int data) {
        Node newLink = new Node(data);
        if (head == null) {
            head = newLink;
        } else {
            tail.next = newLink;
            newLink.prev = tail;
        }
        tail = newLink;
    }
    //allow user to attach new elements to the front  of the list
    public void addFrontElement(int data) {
        Node newLink = new Node(data);
        if (head == null) {
            tail = newLink;
        } else {
            head.prev = newLink;
            newLink.next = head;
        }
        head = newLink;
    }

    //store elements from the list into an arraylist to be sorted
    public ArrayList < Integer > sortList() {
        
        ArrayList <Integer> numbers = new ArrayList <> ();
        Node temp = head;
        while (temp != null) {
            try{
            numbers.add(temp.data);
            temp = temp.next;
            } 
            catch (NumberFormatException e) {
                //exception handling 
            System.out.println("Number format exception: please enetr integers only.");
            }
        }
        Collections.sort(numbers);
        return numbers;
    }
    
     public void showList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}

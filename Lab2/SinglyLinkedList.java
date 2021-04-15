public class SinglyLinkedList {

    Node head; // head of singly linked list
    Node tail; // tail of singly linked list

    public class Node {
        char data;
        Node next;
        Node(char d) {
            this.data = d;
            this.next = null;
        }
    } //represent a node of the list


    public void addNewNode(char d) {
        Node newNode = new Node(d); //create new node
        if (head != null) {
            tail.next = newNode; //newNode added to tail   
            tail = newNode; //newNode becomes the new tail      
        } else {
            head = newNode;
            tail = newNode;
        } //if list is empty, both head and tail point to newNode
    }

    public void printDigit() {
        //one by one check wether or not an element in the list is a digit
        Node latestNode = head;
        do {
            if (Character.isDigit(latestNode.data) == true)
                System.out.print(latestNode.data + " ");
            latestNode = latestNode.next;
        }
        while (latestNode != null);
    }

    public void printChar() {
        //one by one check wether or not an element in the list is a character
        Node latestNode = head;
        do {
            if (Character.isDigit(latestNode.data) == false)
                System.out.print(latestNode.data + " ");
            latestNode = latestNode.next;

        }
        while (latestNode != null);
    }
}

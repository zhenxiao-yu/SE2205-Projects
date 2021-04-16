import java.util.ArrayList;

public class DoubleLinkedListDriver {
     public static void main(String args[]) {
    //Creating a new object of the DoublyLinkedList
        DoublyLinkedList linkedList = new DoublyLinkedList();
    //Add 10 elements to the list 
    //DoublelyLinkedList allow for new nodes to be added from both the front and the back
    try{
        linkedList.addFrontElement(66);
        linkedList.addFrontElement(18);
        linkedList.addFrontElement(7);
        linkedList.addFrontElement(95);
        linkedList.addFrontElement(13);
        linkedList.addBackElement(23);
        linkedList.addBackElement(78);
        linkedList.addBackElement(99);
        linkedList.addBackElement(3);
        linkedList.addBackElement(67);
    } catch (NumberFormatException e) {
            System.out.println("Number format exception: input should be integers");
        }
    
        System.out.println("Here is all the elements in the list: ");
        linkedList.showList();
        
        int test1= 3; //<-- element that exists in the list
        int test2 = 15; //<-- element that doesnt exist in the list
                
        searchAlg test = new searchAlg(); 
        //In order to perform binary search, the targeted list must be sorted
        ArrayList<Integer> sortedList = linkedList.sortList();
        //check if elements exist in the list
        System.out.println("is " + test1 + " part of the linkedList? " + 
                           test.recursiveBinarySearch(sortedList, 0, sortedList.size()-1, test1)); 
        System.out.println("is " + test2 + " part of the linkedList? " + 
                           test.recursiveBinarySearch(sortedList, 0, sortedList.size()-1, test2)); 

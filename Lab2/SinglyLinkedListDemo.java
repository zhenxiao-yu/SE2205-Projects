import java.util.Scanner; //import Scanner class  to read user input
public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //create the "SinglyLinkedList" Object
        SinglyLinkedList userInputList = new SinglyLinkedList();

        System.out.println("How many characters or digits" +
            " are you planning " +
            "on entering? (enter number below) ");
        int listLength = scan.nextInt();

        // check if list is empty
        if (listLength != 0) {

            System.out.println("Enter your characters or digits one by one below:");
            //create a list of characters
            char characters[] = new char[listLength];
            for (int i = 0; i < listLength; i++) {
                characters[i] = scan.next().charAt(0);
            }
            //add each character as a new Node
            for (int i = 0; i < listLength; i++) {
                userInputList.addNewNode(characters[i]);
            }

            System.out.println("Output (Digits before Characters):");
            userInputList.printDigit(); //print the digits 
            userInputList.printChar(); //print the characters 
        } else {
            System.out.println("List is Empty");
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Parsa
 */
public class DLLDemo {
    public static void main(String args[]){
        String entry = "";
        Scanner s = new Scanner(System.in);
        DoublyLinkedList d = new DoublyLinkedList<String>();
        while(!entry.equalsIgnoreCase("stop")){
            System.out.println("type in an entry or type 'stop' if done");
            entry = s.nextLine();
            if (!entry.equalsIgnoreCase("stop")) {
                d.addLast(entry);
            }
        }
        System.out.println();
        d.show();
        d.showReverse();
        int listLength = d.size();
        for (int i=1; i<=listLength; i++) {
            System.out.print(d.first() + " ");
            d.removeFirst();
        }
        System.out.println();
        String entry2 = "";
        System.out.println();
        while(!entry2.equalsIgnoreCase("stop")){
            System.out.println("type in an entry or type 'stop' if done");
            entry2 = s.nextLine();
            if (!entry2.equalsIgnoreCase("stop")) {
                d.addLast(entry2);
            }
        }
        int listLength2 = d.size();
        System.out.println();
        for (int i=1; i<=listLength2; i++) {
            System.out.print(d.last() + " ");
            d.removeLast();
        }
    }
    
}

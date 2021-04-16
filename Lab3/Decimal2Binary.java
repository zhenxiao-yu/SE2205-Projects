import java.util.Scanner;
public class Decimal2Binary {
     public static void main(String[] args){
         int remainder;
         String output = "";
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your decimal number");
         int userInput = scan.nextInt();
         while (userInput > 0){
             remainder = userInput%2;
             output = remainder + "" +output;
             userInput = userInput / 2;
     }
         System.out.println("the binary representation of your numeber is " +  output);
   }
}
© 2021 GitHub, Inc.

import java.util.Scanner;

public class Dec2Bi {
     public static void DecimalToBinary(int number) {
        if (number != 0) {
            DecimalToBinary(number / 2);
            System.out.print("" + number % 2);
        } else if (number == 0) {
            System.out.print(0);
        }
    }
     
    public static void main(String[] args) {
        int userInput;
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your decimal number: ");
        userInput = s.nextInt();
        System.out.println("The binary representation of your number is: ");
         //using recursive calls
        DecimalToBinary(userInput);
    }
}

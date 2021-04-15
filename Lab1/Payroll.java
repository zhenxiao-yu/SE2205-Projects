//Payroll.java
import java.util.Scanner;
public class Payroll {
    public static void main(String args[]) {
        Scanner tracker = new Scanner(System.in);
        //Part Time
        System.out.println("Name of the part-time employee:");
        String pName = tracker.nextLine();
        System.out.println("Address of the part-time employee:");
        String pAddress = tracker.nextLine();
        System.out.println("Phone No. of the part-time employee: ");
        String pPhoneNumber = tracker.nextLine();
        System.out.println("Hourly rate of the part-time employee: ");
        Double pi = tracker.nextDouble();
        System.out.println("Number of working hours of the part-time employee: ");
        Double pj = tracker.nextDouble();  
        PartTimeEmployee pTE = new PartTimeEmployee(pName, pAddress, pPhoneNumber,pi ,pj); 
        System.out.println("\n" + pTE.getEmployeeName() + "'s payment: $" + pTE.getPayment()+ "\n");
        tracker.nextLine();
        
        //Full Time
        System.out.println("Name of the full-time employee: ");
        String fName = tracker.nextLine();
        System.out.println("Address of the full-time employee: ");
        String fAddress = tracker.nextLine();
        System.out.println("Phone No. of the full-time employee: ");
        String fPhoneNumber = tracker.nextLine();
        System.out.println("Monthly salary of the full-time employee: ");
        Double fi = tracker.nextDouble();
        System.out.println("The full-time employee's tax rate: ");
        Double fj = tracker.nextDouble();
        FullTimeEmployee fTE = new FullTimeEmployee(fName, fAddress, fPhoneNumber, fi ,fj);
        System.out.println("\n" + fTE.getEmployeeName()+ "'s payment: $" + fTE.getPayment()+ "\n");
        tracker.nextLine();
        
        //Manager
        System.out.println("Name of the manager: ");
        String mName = tracker.nextLine();
        System.out.println("Address of the manager: ");
        String mAddress = tracker.nextLine();
        System.out.println("Phone No. of the manager: ");
        String mPhoneNumber = tracker.nextLine();
        System.out.println("Monthly salary of the manager: ");
        Double mMS = tracker.nextDouble();
        System.out.println("The manager's tax rate: ");
        Double mTR = tracker.nextDouble();
        System.out.println("the manager's bonus: ");
        Double mB = tracker.nextDouble();
        Manager m = new Manager(mName, mAddress, mPhoneNumber, mMS , mTR, mB);
        System.out.println("\n" + m.getEmployeeName() + "'payment: $" + m.getPayment()+"\n");
    }
};

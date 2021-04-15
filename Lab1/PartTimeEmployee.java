//PartTimeEmployee.java
public class PartTimeEmployee extends Employee {
    public double hourlyRate;
    public double numberOfHours;
    
   public PartTimeEmployee(String name, String address, String num, double i, double j){
       this.eName = name;
       this.addy = address;
       this.phoneNo = num;
       this.hourlyRate = i;
       this.numberOfHours = j;
   }
   public double getPayment(){
       return this.numberOfHours*this.hourlyRate;
}
};



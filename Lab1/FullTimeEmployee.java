//FullTimeEmployee
public class FullTimeEmployee extends Employee {
    public double Salary;
    public double taxRate;
    
    public FullTimeEmployee(String name, String address, String num,double i, double j){
        this.eName = name;
        this.addy = address;
        this.phoneNo = num;
        this.Salary = i;
        this.taxRate = j;
    }
    public double getPayment() {
        return (this.Salary - (this.Salary*this.taxRate));
    }
}



//Manager
public class Manager extends Employee{
    public double Salary;
    public double taxRate;
    public double bonus;
    public Manager (String name, String address, String num, double i, double j, double k) {
        this.eName=name;
        this.addy = address;
        this.phoneNo =num;
        this.Salary = i;
        this.taxRate = j;
        this.bonus = k;
    }
    public double getPayment() {
        return this.Salary - (this.Salary*this.taxRate) + this.bonus;
    }
}

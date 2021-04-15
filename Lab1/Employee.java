//Employee.java
public class Employee {
    String eName;
    String addy;
    String phoneNo;
    
        public Employee(String name, String address, String num){
            this.eName = name;
            this.addy = address;
            this.phoneNo = num;   
        }
        public Employee(){} //constructer
        
        public void setEmployeeName(String name){
            this.eName = name;
        }
        public void setAddress(String address){
            this.addy= address;
        }
        public void setPhoneNumber(String num){
            this.phoneNo = num;
        }
        public String getEmployeeName(){
            return this.eName;
        }
        public String getAddress(){
            return this.addy;
        }
        public String getPhoneNumber(){
            return this.phoneNo;
        }
        };

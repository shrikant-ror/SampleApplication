package academy.learnprogramming;

public class Programmer extends Employee {
    String designation = "Programmer";

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("address: " + address);
        System.out.println("mobileNumber: " + mobileNumber);
        System.out.println("designation: " + designation);
    }
}

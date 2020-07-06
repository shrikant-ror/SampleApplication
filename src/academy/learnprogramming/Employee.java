package academy.learnprogramming;

public class Employee {
    String name, address;
    int mobileNumber;

    public static void main(String[] args){
        Programmer p = new Programmer();
        p.name = "John Doe";
        p.address = "NYC";
        p.mobileNumber = 1234567890;
        p.display();

        Tester t = new Tester();
        t.name = "Jack Sparrow";
        t.address = "DC";
        t.mobileNumber = 1234567890;
        t.display();
    }
}

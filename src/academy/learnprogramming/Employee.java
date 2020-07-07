package academy.learnprogramming;
import academy.learnprogramming.util.Constant;

public class Employee {
    String name, address;
    int mobileNumber;

    public static void main(String[] args){
        Programmer p = new Programmer();
        p.intro();
        p.name = "John Doe";
        p.address = "NYC";
        p.mobileNumber = 1234567890;
        p.display();

        Tester t = new Tester();
        t.intro();
        t.name = "Jack Sparrow";
        t.address = "DC";
        t.mobileNumber = 1234567890;
        t.display();
    }

    protected void intro(){
        System.out.println(Constant.ANSI_GREEN + "Employee Details are as follow:" + Constant.ANSI_RESET);
    }
}

package academy.learnprogramming;

public class Student {
    int id;
    String name;

    // This is the main entry point for this Java application
    public static void main(String[] args){
        // Creating object/instance of a Student class.
        Student std = new Student();
        // Calling instance declared variables using dot(.) operator
        // Print default values fields
        System.out.println("Default ID " + std.id);
        System.out.println("Default NAME: " + std.name);

        Student std1 = new Student();
        // Assign values to the fields
        std1.id = 10;
        std1.name = "Shrikant";
        System.out.println("Updated ID: " + std1.id);
        System.out.println("Updated NAME: " + std1.name);
    }
}

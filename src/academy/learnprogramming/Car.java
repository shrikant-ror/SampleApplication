package academy.learnprogramming;

// This is demo class for constructor, methods tutorial

public class Car {
    String name, company, engineType;
    float price;

    // Print color in console
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    Car(String n, String c){
        this.name = n;
        this.company = c;
    }
    // Three args constructor
    Car(String n, String c, String e){
        name = n;
        company = c;
        engineType = e;
    }

    // Four args constructor
    Car(String n, String c, String e, float p){
        name = n;
        company = c;
        engineType = e;
        price = p;
    }

    // Copy constructor
    Car(Car c){
        name = c.name;
        company = c.company;
        engineType = c.engineType;
    }

    public static void main(String[] args){
        // Call 3 args constructor
        System.out.println(ANSI_BLUE + "Calling 3 args constructor...." + ANSI_RESET);
        Car c1 = new Car("Civic", "Honda", "PATROL");
        c1.display();
        // Call 4 args constructor
        System.out.println(ANSI_BLUE +"Calling 4 args constructor...." + ANSI_RESET);
        Car c2 = new Car("Amaze", "Honda", "DISELE", 50000);
        c2.display();

        System.out.println(ANSI_BLUE + "Calling copy constructor...." + ANSI_RESET);
        Car c3 = new Car(c2);
        c3.display();

        System.out.println(ANSI_BLUE + "Calling constructor with this...." + ANSI_RESET);
        Car c4 = new Car("Brio", "Toyota");
        c4.display();
    }

    private void display(){
        System.out.println(ANSI_PURPLE + "Car details are as follows:" + ANSI_RESET);
        System.out.println("Car name: " + name);
        System.out.println("Company: " + company);
        System.out.println("engineDetail: " + engineType);
        System.out.println("price: " + price);
    }
}

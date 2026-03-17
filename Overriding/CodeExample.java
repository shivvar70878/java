class Vehicle // here we declare vehicle as a parent class
{
    void engine() // here we create a method engine
    {
        System.out.println("this is vehicle engine");
    }
}

class Bike extends Vehicle // here we declare child class
// we use extends keyword to call parent class
{

  void engine() // here we create method as same as in parent class
    {//  super.engine();
        System.out.println("this is bike engine");
    }
}

public class CodeExample {
    public static void main(String[] arg) {
        Bike honda = new Bike(); // here we create object for bike
        honda.engine(); // calling engine method
        Vehicle v = new Vehicle(); // here we create object for vehicle
        v.engine(); // calling engine method
    }
}

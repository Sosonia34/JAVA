package Autoboat;

public class Car extends Vehicle{
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "I am " + getBrand() + " and i go vroum vroum vroum!";
    }
    
}

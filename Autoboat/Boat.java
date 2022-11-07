package Autoboat;

public class Boat extends Vehicle{
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "i am " + getBrand() + " and i go glou glou";
    }
}

package Autoboat;

public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("clio", 100);
        System.out.println(clio.doStuff());

        Boat titanic = new Boat("Titanic", 500000);
        System.out.print(titanic.doStuff());
    }
}

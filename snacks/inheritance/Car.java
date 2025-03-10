package inheritance;

public class Car extends Vehicle {
    
    @Override
    public String drive() {
        super.drive();
        return "Repairing a car";
    }


}

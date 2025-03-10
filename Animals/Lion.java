package Animals;

public class Lion extends Animal{
    @Override
    public void speak() {
        System.out.println("Roar");
    }
    @Override
    public void move() {
        System.out.println("Lion");
    }
}

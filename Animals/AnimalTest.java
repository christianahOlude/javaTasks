package Animals;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void nonsenseTest() {
//        Animal[] partyAnimals = new Animal[5];
//        partyAnimals[0] = new Lion();
//        partyAnimals[1] = new Cat();
//        partyAnimals[2] = new Dog();
//        partyAnimals[3] = new Goat();
//        partyAnimals[4] = new Animal();
//
//        Arrays.stream(partyAnimals).forEach(animal -> animal.speak());
//        Animal aja = new Dog();


        Cat pussyCat = new Cat() {
            @Override
            public void move() {
                System.out.println("My move");
            }
        }
    }
}
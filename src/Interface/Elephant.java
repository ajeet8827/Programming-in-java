package Interface;

public class Elephant implements Animal{

    @Override
    public void makeSound() {
        System.out.println("An Elephant Makes Trumpet Sound");
    }

    @Override
    public void eat() {
        System.out.println("Elephant Eats Grasses And Leaves");

    }
}

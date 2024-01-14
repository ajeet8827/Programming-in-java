package Interface;

public class Lion implements Animal{

    @Override
    public void makeSound() {

        System.out.println("A Lion Roar");

    }

    @Override
    public void eat() {
        System.out.println("Lion Eats Flesh");

    }
}

package Interface;

public class UseAnimal {
    public static void main(String[] args) {
        Animal animal;
        animal = new Elephant();// yaha animal elephant ko point kr rha hai
        animal.makeSound();
        animal.eat();

        animal= new Lion();// yaha animal ref lion ko point kr rha hai.......
        animal.makeSound();
        animal.eat();



        /*
                  we achive runtime polymorphism......
                  run time polymorphism achieve by interface and abstract class and method;
         */
    }
}

package Inheritance;
/*
  Inheritance is a best oops concept of java .....
  vehicle ke sare property ka use car kr raha without koi code likhe
  but agar koi extra functionaly add krni ho to use k skta
  hai car....jaise ki --- reverse() property car ne add ki
  baki property Vehicle se inherit kr liya car ne.....

*/
public class Usevehicle {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.start();
        audi.accelerate();
        audi.reverse();
        audi.turnLeft();
        audi.turnRight();
    }
}

package ObjectTypeCasting;

public class Parent {
    void printData(){
        System.out.println("Method of parent class");

    }

}

class Child extends Parent{
    void printData(){
        System.out.println("method of child class");
    }
}
class Main{
    public static void main(String[] args) {
        Parent obj1 = (Parent) new Child();
        Parent obj2 = (Parent) new Child();

        obj1.printData();
        obj2.printData();
    }
}
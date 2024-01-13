package Polymorphism;

public class UseShape {

    public static void main(String[] args) {
        Shape s = new Shape();
        s.area('A');
        s.area(10.0);
        s.area(5,7);
    }
}

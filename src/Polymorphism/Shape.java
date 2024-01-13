package Polymorphism;

public class Shape {
    public void area(double radius){
        double ar= Math.PI*Math.pow(radius,2);
        System.out.println("Area of circle ="+ar);
    }

    public void area(int side){
        int ar= side * side;
        System.out.println("Area of square ="+ar);
    }

    public void area(int length,int breadth){
        int ar= length*breadth;
        System.out.println("Area of Rectangle ="+ar);
    }


}

package ConstructorChaining;

public class Car {
    String color;
    String model;
    int year;
    Car(String color,String model,int year){
        this.color=color;
        this.model=model;
        this.year=year;


    }


    Car(){
        this("Red","New",2001);

    }


    void display(){
        System.out.println(color+" "+model+" "+ year);
    }

}

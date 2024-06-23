package Encapsulation1;

public class Student {
    private int age;
    private String name;
    private double per;

    Student(int age,String name,double per){
        this.age=age;
        this.name=name;
        this.per =per;
    }

    public void show(){
        System.out.println(age+" "+name+" "+per);
    }
}


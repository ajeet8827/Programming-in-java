package StaticVariable;

public class Student {
    int roll;
    String name;
   static String clg="Technocrats Institute Of Technology & Science";

    Student(int r,String n){
        roll=r;
        name=n;
    }

    public void show(){
        System.out.println("Roll no: "+roll +" "+"Name is:"+name +" "+"Clg name:"+clg);
    }
}

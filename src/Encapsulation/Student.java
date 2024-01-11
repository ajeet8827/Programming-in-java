package Encapsulation;

public class Student {

    private int roll;
    private String name ;
    private double per;

    public void setStudent(int r ,String s, double p){
        if(r%2==0){
            roll=r;
        }
        else{
            System.out.println("roll number must be even");
        }

        name =s ;
        per = p;



    }

    public void showStudent(){
        System.out.println("Rollno="+roll);
        System.out.println("Name ="+name);
        System.out.println("per ="+per);
    }

}

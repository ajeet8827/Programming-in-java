package ThisKeyword;

public class Student {
    private int roll;
    private String name;// instance variable
    private double per;



    public void setStudent(int roll,String name, double per){// formal argument
        this.roll =roll;// this ke pass object ka address hai
        this.name =name;
        this.per=per;
    }

    public void showStudent(){
        System.out.println("Roll="+roll+", Name="+name+", per="+per);
    }
}

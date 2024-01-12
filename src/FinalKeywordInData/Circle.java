package FinalKeywordInData;

public class Circle {
    private int rad;
    private final double pi;

    public Circle(){
        pi=3.14;
    }

//    public Circle(int r){
//         rad = r;
//    }

    public void show(){

        System.out.println("Radius is ="+rad);
        System.out.println("Pi is ="+pi);
    }

}

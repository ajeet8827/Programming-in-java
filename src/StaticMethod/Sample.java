package StaticMethod;
/*
          directly static cheeje non static ko call
          nahi kr skti hai uske liye hame class ka
          create krna padega object


 */
public class Sample {

    int a=10;

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println("a is "+s.a);
    }
}

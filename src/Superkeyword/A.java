package Superkeyword;

public class A {
    public A(){
        System.out.println("In constructor of A:");
    }
}

class B{
    public B(){
        super();
        System.out.println("In constructor of B:");
    }
}
class UseB{
    public static void main(String[] args) {
        B b = new B();

    }

}

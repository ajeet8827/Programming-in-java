package Polymorphism1;

public class UseBinding {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();// static ke liye java reference dekhti hai kyon ki show method static hai
        p.display();// yaha display method non-static hai isliye java yaha object dekhegi-----
        // Non static ke liye object dekhti hai
        // yah display parent ka hai to output me parent ka display prnt hoga

        p=new Child();// parent class ka ref child class ko point kr skti hai
        //
        p.show();// yaha show method static hai to java compiler ref ka type dekh ke output dega
        p.display();// yaha display method non-static hai to java compiler object dekh kr output dega ......

    }
}

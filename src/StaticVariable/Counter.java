package StaticVariable;

/*
    Each time a new Counter object is created,
    the constructor is called, and a new instance of the count variable is created and initialized to 0.
    The constructor increments this count by 1 and prints it.
    Since each object has its own count variable,
    the output is 1 for each object creation.
 */
public class Counter {
    int count=0;// INSTANCE VARIABLE    ===== INSTEAD OF INSTANCE VARIABLE WE CAN USE STATIC VARIABAL SO OUTPUT IS DIFFE....

    Counter(){
        count++;
        System.out.println(count);
    }
}
class UseCounter{
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1=new Counter();
    }
}

package ArgumentPassing;


class Mymath{
    public void add(int a,int b){// formal argument
        int c=a+b;
        System.out.println("sum is "+c);
    }
}
public class ArgPassDemo1 {
    public static void main(String[] args) {
        Mymath m = new Mymath();
        int x=10,y=20;
        m.add(x,y);// actual argument.....
    }
}

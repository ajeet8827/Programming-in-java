package ArgumentPassing;



public class ArgPassDemo2 {
    public static void main(String[] args) {

        int x =20,y=20;
        System.out.println("before increament, x= "+x +"y= "+y);
        increament( x,y);
        System.out.println("After increament, x=" +x +"y= "+y);
    }

    public static void increament(int a,int b){
        a=a+5;
        b=b+5;
    }
}

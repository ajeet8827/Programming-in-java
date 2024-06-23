package StaticMethod;
class MyMath{
    public static int add(int a ,int b){
        return a+b;
    }

}
public class UseMyMath {
    public static void main(String[] args) {
//        MyMath m ;
////        m=new MyMath();
////        System.out.println("The sum of 10 and 20="+m.add(10,20));
//        System.out.println("The sum of 10 and 20 is = "+MyMath.add(10,20));
      int ans=  MyMath.add(3,5);
        System.out.println(ans);
    }
}

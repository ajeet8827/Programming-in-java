package StaticBlock;
class Data{
    /*
      Class ke pahle use ke bad static block run nahi hoga
      only constructor run hoga kyo ki class ke jitne
      object bante hai contructor automatic call hota hai ...
      jitne bar class ka object banega,,,,.....
     */

    public Data(){
        System.out.println("Constructor called...");// cons har object create krne me chalta hai
    }
    static {
        System.out.println("Static block called...");
    }

    public static void show(){
        System.out.println("show is called");
    }
}
public class UseData {

    public static void main(String[] args) {
        Data.show();
        Data.show();

        Data d = new Data();
//        Data d1 = new Data();
//        Data d2 =new Data();
    }
}

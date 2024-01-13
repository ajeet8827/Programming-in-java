package AbstractKeyword;

abstract public class A {

    public abstract void show();
    public abstract void see();

    public  void sanju(){
        System.out.println("gujjar");
    }
}

class B extends A{

    public void show(){

        System.out.println("ajeet");

    }

    @Override
    public void see() {

        System.out.println("sujeet");

    }
}

class UseA{
    public static void main(String[] args) {
        A a ;
        a = new B();
        a.show();
        a.see();
        a.sanju();
    }
}



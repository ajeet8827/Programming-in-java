package MethodOverloading;

public class Addition {
    public int add(int a ,int b ){

        int c ;
        c=a+b;
        return c;
    }
    public int add(int a ,int b ,int c){

        int d ;
        d=a+b+c;
        return d;
    }
    public int add(int a ,int b ,int c,int d){

        int e ;
        e=a+b+c+d;
        return e;
    }

    public double add(double i, double j){
        double k;
        k=i+j;
        return k;
    }

    public String add(String s1 , String s2){
        String s3 ;
        s3=s1+s2;
        return s3;
    }

    public void show(int age,String name ){
        System.out.println("age= "+age);
        System.out.println("name= "+name);
    }

    public void show(String name, int age ){
        System.out.println("name= "+name);
        System.out.println("age= "+age);
    }
}

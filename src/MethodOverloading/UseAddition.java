package MethodOverloading;

public class UseAddition {

    public static void main(String[] args) {
        Addition obj =new Addition();
        // type of parameter -1
//        System.out.println("sum of 10 and 20 is "+obj.add(10,20));
//        System.out.println("sum of 10.5 and 20.5 is "+obj.add(10.5,20.5));
//        System.out.println("concetenation of Good and Morning is "+obj.add("Godd","Morning"));

        // number of perameter........-2

//        System.out.println("sum of 10 and 20 is "+obj.add(10,20));
//        System.out.println("sum of 10,20and 30 is "+obj.add(10,20,30));
//        System.out.println("sum of 10,20,30and 50 is "+obj.add(10,20,30,50));

        //overloading on the basis of order of argument....
        obj.show(21,"ajeet");
        obj.show("ajeet",23);
    }

}

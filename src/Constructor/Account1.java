package Constructor;

import java.util.Scanner;

/*
                 *Paramaterized constructor*
 */
public class Account1 {
    private int accId;
    private String name ;
    private double balance;

    private static double rateOfInt;

    static {
        System.out.println("Enter the rate of Int:");
        Scanner sc = new Scanner(System.in);
        rateOfInt=sc.nextDouble();
    }

    public Account1(int id,String n,double bal){

        accId =  id;
        name = n;
        balance=bal;


    }

    public void showAccount1(){
        System.out.println("Id="+accId);
        System.out.println("Name="+name);
        System.out.println("Balance"+balance);
    }
}

package Constructor;
/*
                 Defalut and Non- paramatrizes contrucotor
 */
public class Account {

    private int accId;

    private String name;

    private double balance;

    Account(){
        accId =101;
        name = "ajeet";
        balance = 5000.0;
        System.out.println("constructor called");
    }

    public void showAccount(){
        System.out.println("id="+accId);
        System.out.println("name="+name);
        System.out.println("balance="+balance);
    }
}

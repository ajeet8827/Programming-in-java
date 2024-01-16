package ExceptionHandling;

import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();

            int c =a/b;
            System.out.println("Div is:"+c);
            System.exit(0);// iske karan finallly block run nhi hoga.....
        }
        catch ( ArithmeticException ex)
        {
            System.out.println("Denominator should not be 0");
        }
        finally {
            System.out.println("have a good day");
        }

        System.out.println("Bye!");
    }
}
/*
         ham isme teen case handle karege
         1.20/5 ..... is case se teeno output achhe se print hoga
         2. 5/0 ......try block me exception aa gai ab direct catch block chalega
                      yaha exception handle hone ke karan finaly block ke aage wala bhi code run
                      ho gya..
         3. agar 5/abc...... InuputMisMatchException ... arhi hai but isko handle krne ke liye koi catch block nahi h....
         isliye keval finally block execute hoga ....
 */
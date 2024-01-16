package ExceptionHandling;

import java.util.Scanner;

class NegativeNumerstorException extends Exception
{

    public NegativeNumerstorException(String str)
    {
        super(str);
    }
}

public class CustomeExceptiondemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter first element");
            int a =sc.nextInt();
            System.out.println("Enter sec element");
            int b=sc.nextInt();
            if(a<=0){

                NegativeNumerstorException obj = new NegativeNumerstorException("Numerator must be possitive:");
                throw obj;

                // exception class ke pass do contructor hota hai ek parametrized and ek non parametrized.....
            }
            int c =a/b;
            System.out.println("Div is"+c);
        }catch (ArithmeticException | NegativeNumerstorException ex){
            System.out.println("Exception caught:"+ex);

        }
//        catch (NegativeNumerstorException ex2)
//        {
//            System.out.println(ex2.getMessage());
//
//        }
    }
}

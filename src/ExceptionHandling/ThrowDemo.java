package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter two element");
            int a =sc.nextInt();
            int b=sc.nextInt();
            if(a<=0){
//                ArrayIndexOutOfBoundsException obj = new ArrayIndexOutOfBoundsException();
//                throw obj;

                  ArithmeticException obj = new ArithmeticException("Numerator must be possitive:");
                  throw obj;

                  // exception class ke pass do contructor hota hai ek parametrized and ek non parametrized.....
            }
            int c =a/b;
            System.out.println("Div is"+c);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());

        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("Numerator must be zero:");
//
//        }
//        catch (ArithmeticException ex1){
//            System.out.println("Exception message is"+ex1.getMessage());
//        }
    }
}

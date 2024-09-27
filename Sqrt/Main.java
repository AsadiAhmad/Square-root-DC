package Sqrt;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SqrtSimple sqrtSimple = new SqrtSimple();
        SqrtDC sqrtDC = new SqrtDC();
        SqrtTool sqrtTool = new SqrtTool();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the number[0] or random number[1][default] ? : ");
        int choose = myScanner.nextInt();
        BigInteger randomDigit;
        BigInteger x;
        BigInteger y;
        if (choose == 0) {
            System.out.print("Please Enter the number you want to sqrt : ");
            x = myScanner.nextBigInteger();
        }
        else {
            System.out.print("Please Enter the number of digit for random number : ");
            randomDigit = myScanner.nextBigInteger();
            x = sqrtTool.createRandomNumber(randomDigit);
        }
        y = x;

        System.out.print("simple way(bad executeTime)[0] or Divide and Conquer[1][default] or both[2] ? : ");
        int choose2 = myScanner.nextInt();
        System.out.print("show result(may biginteger)[0] or dont[1][default] ? : ");
        int choose3 = myScanner.nextInt();
        if (choose2 == 0) {
            long startSimple = System.nanoTime();
            x = sqrtSimple.sqrtSimple(x);
            long endSimple = System.nanoTime();
            if (choose3 == 0) {
                System.out.println("the number is : " + y);
                System.out.println("the result of simple sqrt is : " + x);
            }
            System.out.println("the execute time of simple sqrt : " + ((endSimple - startSimple) / 1000000) + "ms");
        }
        else if (choose2 == 2) {
            long startSimple = System.nanoTime();
            x = sqrtSimple.sqrtSimple(x);
            long endSimple = System.nanoTime();
            if (choose3 == 0) {
                System.out.println("the number is : " + y);
                System.out.println("the result of simple sqrt is : " + x);
            }
            System.out.println("the execute time of simple sqrt : " + ((endSimple - startSimple) / 1000000) + "ms");

            long startDC = System.nanoTime();
            x = sqrtDC.sqrtDC(x);
            long endDC = System.nanoTime();
            if (choose3 == 0) {
                System.out.println("the number is : " + y);
                System.out.println("the result of divide and conquer sqrt is : " + x);
            }
            System.out.println("the execute time of divide and conquer sqrt : " + ((endDC - startDC) / 1000000) + "ms");
        }
        else {
            long startDC = System.nanoTime();
            x = sqrtDC.sqrtDC(x);
            long endDC = System.nanoTime();
            if (choose3 == 0) {
                System.out.println("the number is : " + y);
                System.out.println("the result of divide and conquer sqrt is : " + x);
            }
            System.out.println("the execute time of divide and conquer sqrt : " + ((endDC - startDC) / 1000000) + "ms");
        }



    }
}

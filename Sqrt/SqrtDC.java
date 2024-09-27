package Sqrt;

import java.math.BigInteger;
import java.lang.Math;

public class SqrtDC {

    public BigInteger sqrtDC (BigInteger x) {
        BigInteger start = new BigInteger("0");               // start = 0
        BigInteger end = x.divide(BigInteger.valueOf(2));         // end = x / 2
        BigInteger mid = new BigInteger("0");                 // mid = 0
        BigInteger midMid;
        BigInteger one = new BigInteger("1");
        while (start.compareTo(end) != 1) {                       // while (start <= end)
            mid = (start.add(end)).divide(BigInteger.valueOf(2)); // mid = start + end / 2
            midMid = mid.multiply(mid);                           // midMid = mid * mid
            if (midMid.compareTo(x) == 0) {                       // midMid == x
                return mid;
            }
            else if (midMid.compareTo(x) == -1) {                  // midMid < x
                start = mid.add(one);
            }
            else {                                                 // midMid > x
                end = mid.subtract(one);
            }
        }
        return mid.subtract(one);
    }

    public BigInteger sqrtDCPro (BigInteger x) {

        SqrtTool sqrtTool = new SqrtTool();

        BigInteger digit = sqrtTool.getDigit(x);
        BigInteger one = new BigInteger("1");
        BigInteger ten = new BigInteger("10");

        long startDC = System.nanoTime();
        BigInteger start = sqrtTool.power(ten, sqrtTool.digitCal1(digit));  // start = 10^(d/2)
        BigInteger end = sqrtTool.power(ten, sqrtTool.digitCal2(digit));    // end = 10^(d)
        long endDC = System.nanoTime();
        System.out.println((endDC - startDC)/1000000 + "ms");
        BigInteger mid = new BigInteger("0");                 // mid = 0
        BigInteger midMid;
        while (start.compareTo(end) != 1) {                       // while (start <= end)
            mid = (start.add(end)).divide(BigInteger.valueOf(2)); // mid = start + end / 2
            midMid = mid.multiply(mid);                           // midMid = mid * mid
            if (midMid.compareTo(x) == 0) {                       // midMid == x
                return mid;
            }
            else if (midMid.compareTo(x) == -1) {                  // midMid < x
                start = mid.add(one);
            }
            else {                                                 // midMid > x
                end = mid.subtract(one);
            }
        }
        return mid.subtract(one);
    }
}

package Sqrt;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class SqrtTool {

    Random rand = new Random();

    public BigInteger createRandomNumber(BigInteger x) {
        BigInteger myRand = new BigInteger("0");
        int digit;
        BigInteger one = new BigInteger("1");
        for (BigInteger i = new BigInteger("0"); i.compareTo(x.subtract(one)) == -1; i = i.add(one)) {
            digit = rand.nextInt(10);
            myRand = myRand.add(BigInteger.valueOf(digit));
            myRand = myRand.multiply(BigInteger.valueOf(10));
        }
        return myRand;
    }

    public BigInteger getDigit(BigInteger x) {
        BigInteger counter = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        while (x.compareTo(BigInteger.valueOf(0)) == 1) {
            counter = counter.add(one);
            x = x.divide(BigInteger.valueOf(10));
        }
        return counter;
    }

    public BigInteger power (BigInteger x, BigInteger y) {
        BigInteger one = new BigInteger("1");
        BigInteger res = new BigInteger("1");
        for (BigInteger i = new BigInteger("0"); i.compareTo(y) == -1; i = i.add(one)) {
            res = res.multiply(x);
        }
        return res;
    }

    public BigInteger digitCal1 (BigInteger x) {
        return x.divide(BigInteger.valueOf(2));
    }
    public BigInteger digitCal2 (BigInteger x) {
        return x.add(BigInteger.valueOf(1).divide(BigInteger.valueOf(2)));
    }
}

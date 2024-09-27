package Sqrt;

import java.math.BigInteger;

public class SqrtSimple {

    public BigInteger sqrtSimple (BigInteger x) {
        BigInteger i = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        while (i.multiply(i).compareTo(x) !=  1) { // i*i <= x
            i = i.add(one);
        }
        return i.subtract(one);
    }

}

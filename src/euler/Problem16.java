//ProjectEuler Problem 16. Author: oladeji oluwasayo
package euler;
import java.math.BigInteger;
public class Problem16 {
    private static BigInteger c(int e, int a) {
        BigInteger r = f(e).divide(f(e - a).multiply(f(a)));
        return r;
    }
    private static BigInteger f(int i) {
        if (i <= 1)
            return BigInteger.ONE;
        else {
            BigInteger s = BigInteger.ONE;
            for (int a = i; a > 1; a--)
                s = s.multiply(new BigInteger(Integer.toString(a)));
            return s;
        }
    }
    public static void main(String args[]) {
        int e = 1000; BigInteger s = BigInteger.ZERO;
        if (args.length >= 2)
            e = Integer.parseInt(args[1]);
        for (int a = 0; a <= e; a++)
            s = s.add(c(e, a));
        char[] arr = s.toString().toCharArray();
        int s2 = 0;
        for (char element : arr)
            s2 += Integer.parseInt(Character.toString(element));
        System.out.print(s2);
    }
}
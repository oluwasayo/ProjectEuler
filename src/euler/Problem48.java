/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.math.BigInteger;

/**
 *
 * @author oladeji
 */
public class Problem48 {
    
    public static void main(String args[]) {
        BigInteger sum = BigInteger.ZERO;
        for (int a = 1; a <= 1000; a++) {
            sum = sum.add((new BigInteger(Integer.toString(a))).pow(a));
        }
        String ans = sum.toString();
        String result = ans.substring(ans.length() - 10);
        System.out.println(result);
    }
}

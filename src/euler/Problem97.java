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
public class Problem97 {
    
    public static void main(String args[]) {
        BigInteger num = (new BigInteger(Integer.toString(2))).pow(7830457);
        num = num.multiply(new BigInteger(Integer.toString(28433)));
        num = num.add(BigInteger.ONE);
        
        String ans = num.toString();
        System.out.println(ans.substring(ans.length() - 10));
    }
}

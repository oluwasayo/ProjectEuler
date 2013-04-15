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
public class Problem20 {
    
    public static void main(String args[]) {
        BigInteger fact = BigInteger.ONE;
        int sum = 0;
        
        for (int a = 2; a<=100; a++) {
            fact = fact.multiply(new BigInteger(Integer.toString(a)));
        }
        
        char[] myArr = fact.toString().toCharArray();
        
        for (char element : myArr) {
            sum += Integer.parseInt(Character.toString(element));
        }
        
        System.out.println(sum);
    }
}

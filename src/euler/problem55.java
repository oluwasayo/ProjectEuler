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
public class problem55 {
    
    public static void main(String args[]) {
        int count = 0;
        outer: for (int a = 10; a < 10000; a++) {
            
            BigInteger numb = new BigInteger(Integer.toString(a));
            for (int b = 1; b < 50; b++) {
                String num = numb.toString();
                String reverseNum = (new StringBuilder(num)).reverse().toString();
                BigInteger sum = numb.add(new BigInteger(reverseNum));
                if (isPalindromic(sum)) {
                    continue outer;
                }
                numb = sum;
            }
            
            count++;
        }
        System.out.println(count);
    }

    private static boolean isPalindromic(BigInteger a) {
        String num = a.toString();
        String reverseNum = (new StringBuilder(num)).reverse().toString();
        if (num.equals(reverseNum))
            return true;
        else
            return false;
    }
}

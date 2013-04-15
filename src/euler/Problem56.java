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
public class Problem56 {
    
    public static void main(String args[]) {
        long max = 0;
        for(int a = 1; a<100; a++) {
            for (int b = 1; b< 100; b++) {
                BigInteger ans = (new BigInteger(Integer.toString(a))).pow(b);
                char[] myArr = ans.toString().toCharArray();
                long total = 0;
                for (char element : myArr) {
                    total += Integer.parseInt(Character.toString(element));
                }
                if(total > max)
                    max = total;
            }
        }
        System.out.println(max);
    }
}

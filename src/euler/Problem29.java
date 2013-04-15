/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author oladeji
 */
public class Problem29 {
    
    public static void main(String args[]) {
        Set<BigInteger> mySet = new HashSet<BigInteger>();
        
        for (int a = 2; a <= 100; a++) {
            for (int b = 2; b <=100; b++) {
                BigInteger ans = (new BigInteger(Integer.toString(a))).pow(b);
                mySet.add(ans);
            }
        }
        
        System.out.println(mySet.size());
    }
}

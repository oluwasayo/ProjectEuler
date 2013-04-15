/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oladeji
 */
public class Problem10 {
    
    static List<Integer> primes = new ArrayList<Integer>();
    
    static boolean isDivide(int num) {
        for (int element : primes) {
            if (num % element == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        
        primes.add(2);
        System.out.println("added:\t" + 2);
        int num = 3;
        while (true) {
            if(isDivide(num) == false) {
                primes.add(num);
                System.out.println("added:\t" + num);
                
            }
                
            num+=2; //starting from 3 and we are rest assured that even
                //numbers (asides 2) can never be primes
            
            if (primes.get(primes.size()-1) >= 20000) {
                int spill = (primes.size() - 1);
                System.out.println("removed: " + primes.get(spill));
                primes.remove(primes.get(spill));
                
                break;
            }
        }
        
        long sum = 0;
        for (int element : primes) {
            sum+=element;
        }
        sum -= primes.get(primes.size() - 1);
        System.out.println(sum);
    }
}

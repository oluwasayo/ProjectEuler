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
public class Problem3 {
    
    static List<Integer> primes = new ArrayList<Integer>();
    
    static boolean isDivide(int num) {
        for (int element : primes) {
            if (num % element == 0)
                return true;
        }
        return false;
    }
    
    public static void main(String args[]) {
        
        primes.add(2);
        int num = 3;
        while (true) {
            if(isDivide(num) == false) {
                primes.add(num);
                System.out.println("added:\t" + num);
                
            }
                
            num+=2; //starting from 3 and we are rest assured that even
                //numbers (asides 2) can never be primes
            
            if (primes.get(primes.size()-1) >= 775146)
                break;
        }
        
        long hit = 0;
        for (int a = primes.size() - 1; a >= 0; a--) {
            if (600851475143L % primes.get(a) == 0) {
                hit = primes.get(a);
                break;
            }
        }
        
        System.out.println(hit);
    }
}

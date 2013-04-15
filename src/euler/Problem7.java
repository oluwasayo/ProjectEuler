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
public class Problem7 {
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
            if(isDivide(num) == false)
                primes.add(num);
            num++;
            if (primes.size() >= 10001)
                break;
        }
        
        System.out.println(primes.get(10000));
    }
}

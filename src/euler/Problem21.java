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
public class Problem21 {
    static int sum = 1;
    
    public static void main(String args[]) {
        for (int a = 2; a < 10000; a++) {
            if (isAmicable(a))
                sum+=a;
        }
        
        System.out.println(sum);
    }

    private static boolean isAmicable(int a) {
        int s = sumOfDivisors(a);
        if (sumOfDivisors(s) == a)
            return true;
        else
            return false;
    }

    private static int sumOfDivisors(int num) {
        List<Integer> divs = new ArrayList<Integer>();
        int total = 0;
        for (int a = num / 2; a >= 1; a--) {
            if (num % a == 0)
                divs.add(a);
        }
        for (int element : divs) {
            total+=element;
        }
        
        return total;
    }
}

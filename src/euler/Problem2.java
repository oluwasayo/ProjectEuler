/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class Problem2 {
    static long fibA = 1, fibB = 2, sum = 2;
    static long fib = 3;
    
    public static void solve (int limit) {
        
        for (int a = 3; fib <= 4000000; a++) {
            fib = fibA + fibB;
            if (fib > 4000000)
                break;
            if (fib % 2 == 0) {
                sum+=fib;
            }
            fibA = fibB;
            fibB = fib;
        }
    }
    
    public static void main(String args[]) {
        solve(4000000);
        System.out.println(sum);
    }
}

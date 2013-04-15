/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class Problem6 {
    
    public static void main(String args[]) {
        int sum = 0;
        long sumOfSquare = 0;
        
        for (int a = 1; a <= 100; a++) {
            sum += a;
            sumOfSquare += (a * a);
        }
        
        long squareOfSum = (sum * sum);
        
        System.out.println(squareOfSum - sumOfSquare);
    }
}

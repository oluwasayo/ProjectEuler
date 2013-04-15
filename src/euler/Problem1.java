/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class Problem1 {
    
    //this problem can be solved in O(1) complexity
    //but I'm using an easier-to-implement O(n) solution since there
    //are no constraints
    
    public static void main(String args[]) {
        int sum = 0;
        for (int a = 3; a < 1000; a++) {
            if ((a%3 == 0) || (a%5 == 0)) {
                sum+=a;
            }
        }
        System.out.println(sum);
    }
}

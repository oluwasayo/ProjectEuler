/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class Problem5 {
    
    public static void main(String args[]) {
        int num = 20;
        
        for (int a = 2; a <= 20; a++) {
            if (num % a != 0) {
                a = 2;
                num+=20;
                continue;
            }
        }
        
        System.out.println(num);
    }
}

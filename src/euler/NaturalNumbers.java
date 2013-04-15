/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class NaturalNumbers {
    
    public static int solve(int n) {
        int my3 = 0;
        int my5 = 0;
        if ((n%3) == 0)
            my3 = -1;
        if ((n%5) == 0)
            my5 = -1;
        return (n/3) + (n/5) + my3 + my5;
    }
    
    public static int solveDumb(int n) {
        if (n <= 3) {
            return 0;
        } else if (n <= 5) {
            return 1;
        }
        int sumOfThree = 0;
        int sumOfFive = 0;
        for (int a = 3; a < 1000; a+=3) {
            sumOfThree += a;
        }
        for (int a = 5; a < 1000; a+=5) {
            sumOfFive += a;
        }
        return sumOfThree + sumOfFive;
    }
    
    public static void main (String args[]) {
        int n;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        } else {
            n = 1000;
        }
        System.out.println(solveDumb(n));
    }
}

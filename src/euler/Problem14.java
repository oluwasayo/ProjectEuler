/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

/**
 *
 * @author oladeji
 */
public class Problem14 {
    static int total = 1;
    static int max = 1;
    static int numOfMax = 999999;

    private static int next(int num) {
        if (num % 2 == 0)
            return num / 2;
        else
            return (3 * num) + 1;
    }
    
    
    public static void main(String args[]) {
        for (int a = 999999; a > 800000; a-=2) {
            int num = a;
            //System.out.print(a + ":\t\t");
            while(num > 1) {
                num = next(num);
                //System.out.print(num + " ");
                total++;
            }
            
            if (total > max) {
                max = total;
                numOfMax = a;
            }
                
            total = 1;
            System.out.println();
        }
        
        System.out.println(numOfMax);
    }
}

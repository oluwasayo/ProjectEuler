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
public class Problem58 {
    
    public static void main(String[] args) {
        List<Integer> ne = new ArrayList<Integer>();
        List<Integer> nw = new ArrayList<Integer>();
        List<Integer> sw = new ArrayList<Integer>();
        List<Integer> se = new ArrayList<Integer>();
        ne.add(3);
        nw.add(5);
        sw.add(7);
        se.add(9);
        for (int a = 2; a < 50; a++) {
            int l = (2*a) + 1;
            ne.add(ne.get(ne.size() - 1) + (3*l) + (l-2));
            nw.add(nw.get(nw.size() - 1) + (8 * a) - 4);
        }
        
        
    }
}

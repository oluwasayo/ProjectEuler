/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author oladeji
 */
public class Problem22 {
    
    public static void main (String args[]) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:/users/oladeji/Desktop/names2.txt"));
        List<String> dataList = new ArrayList<String>(5000);
        while (scanner.hasNext("\\w+")) {
            dataList.add(scanner.next("\\w+"));
        }
        
        for (String element : dataList) {
            System.out.println(element);
        }
    }
}

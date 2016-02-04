/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_16;

import java.util.Arrays;

/**
 *
 * @author ugurdonmez
 */
public class Solution_06 {
    
    public static void main(String [] args) {
        int [] array1 = {1,3,15,11,2};
        int [] array2 = {23,127,235,19,8};
        
        System.out.println(smallestDifference(array1, array2));
    }
    
    
    public static int smallestDifference(int [] array1, int [] array2) {
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        int index1 = 0;
        int index2 = 0;
        
        int minDiff = Integer.MAX_VALUE;
        
        for ( index1 = 0 ; index1 < array1.length ; index1++) {
            
            if ( array1[index1] < array2[index2] ) {
                 continue;
            } else {
                while ( index2 < array2.length-1 && array1[index1] > array2[index2+1] ) {
                    if ( index2 < array2.length - 2 ) {
                        index2++;
                    }
                }
                
                int diff = array1[index1] - array2[index2];
                if ( diff >= 0 && diff < minDiff ) {
                    minDiff = diff;
                }
            }
            
        }
        
        return minDiff;
        
    }
    
}

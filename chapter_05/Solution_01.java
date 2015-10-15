/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_05;

/**
 *
 * @author ugurdonmez
 */
public class Solution_01 {
    
    public static int insertion(int n, int m, int i, int j) {
        
        // 1. clear bits i->j in n
        // 2. shift m << i
        // 3. return m | n
        
        // 1
        int one = ~0;
        
        int mask_first = one << j;
        int mask_last = one << i;
        
        int mask = mask_first | mask_last;
        
        n = n & mask;
        
        // 2 
        m = m << i;
        
        // 3
        return n | m;
        
    }
    
}

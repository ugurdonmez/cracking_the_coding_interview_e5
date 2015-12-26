/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_08;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution_11 {
    
    public static int getChanges(int amount, int [] denoms, int index, int [][] map) {
        
        if ( map[amount][index] > 0 ) {
            return map[amount][index];
        }
        
        if ( index >= denoms.length && amount == 0 ) {
            return 1;
        }
        
        if ( index >= denoms.length ) {
            return 0;
        }
        
        int ways = 0;
        for ( int i = 0 ; i * denoms[index] <= amount ; i++ ) {
            int remain = amount - i * denoms[index];
            ways += getChanges(remain, denoms, index+1, map);
        }
        
        map[amount][index] = ways;
        return ways;
    }
    
    public static int getChanges(int amount) {
        
        int [] denonms = {25, 10, 5, 1};
        int [][] map = new int[amount+1][denonms.length+1];
        return getChanges(amount, denonms, 0, map);
        
    }
    
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        System.out.println(getChanges(n));
        
    }
    
}

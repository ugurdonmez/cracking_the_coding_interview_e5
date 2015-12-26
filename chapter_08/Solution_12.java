/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_08;

import java.util.ArrayList;

/**
 *
 * @author ugurdonmez
 */
public class Solution_12 {
    
    static int GRID_SIZE = 8;
    
    public static void placeQueens(int row, Integer [] columns, ArrayList<Integer[]> results) {
        
        if ( row == GRID_SIZE ) {
            results.add(columns.clone());
            return;
        }
        
        for ( int i = 0 ; i < GRID_SIZE ; i++ ) {
            if ( check(columns, row, i) ) {
                columns[row] = i;
                placeQueens(row+1, columns, results);
            }
        }
    }
    
    public static boolean check(Integer [] columns, int row, int column) {
        return true;
    }
    
}

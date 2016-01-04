/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_16;

/**
 *
 * @author ugurdonmez
 */
public class Solution_04 {
    
}

enum CellTypes {
    EMPTY, WHITE, BLACK
}

class TicTacToeTable {
    
    private int size;
    
    CellTypes [][] table;

    public TicTacToeTable(int size) {
        this.size = size;
        
        table = new CellTypes[size][size];
    }
    
    public boolean hasWon() {
        
        // rows
        for ( int i = 0 ; i < size ; i++ ) {
            CellTypes first = table[i][0];
            boolean found = true;
            if ( first != CellTypes.EMPTY ) {
                for ( int j = 1 ; j < size ; j++ ) {
                    if ( table[i][j] != first ) {
                        found = false;
                        break;
                    }
                }
            }
            if (found) {
                return true;
            }
        }
        
        // colums
        for ( int i = 0 ; i < size ; i++ ) {
            CellTypes first = table[0][i];
            boolean found = true;
            if ( first != CellTypes.EMPTY ) {
                for ( int j = 1 ; j < size ; j++ ) {
                    if ( table[j][i] != first ) {
                        found = false;
                        break;
                    }
                }
            }
            if (found) {
                return true;
            }
        }
        
        // diagonals
        boolean found = true;
        CellTypes first = table[0][0];
        
        for ( int i = 1 ; i < size ; i++ ) {
            if ( table[i][i] != first ) {
                found = false;
                break;
            }
        }
        if (found) {
            return true;
        }
        
        found = true;
        first = table[0][size-1];
        
        for ( int i = 1 ; i < size ; i++ ) {
            if ( table[i][size-i-1] != first ) {
                found = false;
                break;
            }
        }
        if (found) {
            return true;
        }
        
        return false;
    }
}
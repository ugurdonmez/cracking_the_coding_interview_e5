/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_08;

/**
 *
 * @author ugurdonmez
 */
public class Solution_10 {
    
    public static boolean fill( int [][] screen,  int x, int y, int oldColor, int newColor ) {
        
        if ( x < 0 ) {
            return false;
        }
        
        if ( x == screen.length ) {
            return false;
        }
        
        if ( y < 0 ) {
            return false;
        }
        
        if ( y == screen[0].length ) {
            return false;
        }
        
        if ( screen[x][y] == newColor ) {
            return false;
        }
        
        screen[x][y] = newColor;
        
        fill(screen, x-1, y, oldColor, newColor);
        fill(screen, x+1, y, oldColor, newColor);
        fill(screen, x, y-1, oldColor, newColor);
        fill(screen, x, y+1, oldColor, newColor);
        
        return true;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_05;

import java.util.ArrayList;

/**
 *
 * @author ugurdonmez
 */
class Pair {
    int start;
    int end;
    
    public Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public String toString() {
        
        return start + " " + end;
        
    }
    
    // if they can connect return length, otherwise return 0
    public static int canConnect(Pair pair1, Pair pair2) {
        if (pair2.start - pair1.end == 1) {
            return pair1.end - pair1.start + pair2.end - pair2.start;
        } else {
            return 0;
        }
    }
}

public class Solution_03 {
 
    public static void main (String [] args ) {
        
        int n = 1775;
        
        StringBuilder buf = new StringBuilder();
        
        for ( int i = 31 ; i >= 0 ; i-- ) {
            buf.append(getBit(n, i));
        }
        
        System.out.println(buf);
        
        System.out.println(Solution_03.flipToWin(n));
        
    }
    
    public static int flipToWin(int n) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for ( int i = 31 ; i >= 0 ; i-- ) {
            list.add( getBit(n, i) );
        }
        
        // create pairs
        ArrayList<Pair> pairs = new ArrayList<>();
        
        int last = 0;
        int start = 0;
        for ( int i = 0 ; i < 32 ; i++ ) {
            if ( list.get(i) == 1 ) {
                if ( last == 0 ) {
                    start = i;
                } else {
                    
                }
            // found 0
            } else {
                if ( last == 1 ) {
                    pairs.add(new Pair(start, i));
                } else {
                    
                }
            }
            
            last = list.get(i);
        }
        
        if ( last == 1 ) {
            pairs.add(new Pair(start, 32));
        } 
        
        // test 
        for ( Pair p : pairs) {
            System.out.println(p);
        }
        
        int max = 0;
        for ( int i = 0 ; i < pairs.size() - 1 ; i++ ) {
            int connect = Pair.canConnect(pairs.get(i), pairs.get(i+1));
            if ( connect > max ) {
                max = connect;
            }
        }

        return max + 1;
    }
    
    public static int getBit(int n, int i) {
        
        return ((1 << i) & n ) == 0 ? 0 : 1;
        
    }
    
}

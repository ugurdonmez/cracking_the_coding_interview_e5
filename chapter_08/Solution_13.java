/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_08;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ugurdonmez
 */
public class Solution_13 {
    
    private int createStack(ArrayList<Box> boxes) {
        
        Collections.sort(boxes);
        
        int [] map = new int[boxes.size()];
        
        int maxHeight = 0;
        
        for ( int i = 0 ; i < boxes.size() ; i++ ) {
            int height = createStack(boxes, i, map);
            maxHeight = Integer.max(maxHeight, height);
        }
        
        return maxHeight;
    }
    
    private int createStack(ArrayList<Box> boxes, int index, int [] map) {
        
        if ( map[index] > 0 ) {
            return map[index];
        }
        
        Box bottom = boxes.get(index);
        
        int maxHeight = 0;
        
        for ( int i = index+1 ; i < boxes.size() ; i++ ) {
            if ( bottom.isAbove(boxes.get(i)) ) {
                int heigth = createStack(boxes, i, map);
                maxHeight = Integer.max(maxHeight, heigth);
            }
        }
        
        maxHeight += bottom.getH();
        
        map[index] = maxHeight;
        return maxHeight;
    }
    
}

class Box implements Comparable<Box> {
    
    private int w;

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    private int d;
    private int h;

    @Override
    public int compareTo(Box o) {
        return this.h - o.h;
    }
    
    public boolean isAbove(Box box) {
        if ( this.h > box.h && this.w > box.w && this.d > box.d ) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

/**
 *
 * @author ugurdonmez
 */
public class Solution_02 {
    
    public static MyNodeInt minimalTree(int [] numbers, int start, int end) {
        
        if (start == end) {
            return null;
        }
        
        MyNodeInt node = new MyNodeInt(numbers[(end+start)/2]);
        node.left = minimalTree(numbers, start, ((end+start)/2 -1) );
        node.right = minimalTree(numbers, ((end+start)/2+1), end );
        
        return node;
    }
    
}

class MyNodeInt {
    int value;
    MyNodeInt left;
    MyNodeInt right;

    public MyNodeInt(int value) {
        this.value = value;
    }
}

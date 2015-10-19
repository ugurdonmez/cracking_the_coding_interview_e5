/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.*;

/**
 *
 * @author ugurdonmez
 */
public class Solution_09 {
 
    public ArrayList<LinkedList<Integer>> allSequence(BinaryTreeNode node) {
        
        ArrayList<LinkedList<Integer>> result = new ArrayList<>();
        
        if ( node == null ) {
            result.add(new LinkedList<>());
            return result;
        }
        
        LinkedList<Integer> prefix = new LinkedList<>();
        prefix.add(node.value);
        
        
        
        
    }
    
}

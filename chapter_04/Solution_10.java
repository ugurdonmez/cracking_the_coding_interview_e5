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
public class Solution_10 {
    
    public static boolean matchTree(BinaryTreeNode node1, BinaryTreeNode node2) {
        
        if ( node1 == null && node2 == null ) {
            return true;
        } 
        
        if ( node1 == null || node2 == null ) {
            return false;
        }
        
        if ( node1.value != node2.value ) {
            return false;
        }
        
        return matchTree(node1.left, node2.left) && matchTree(node1.right, node2.right);
        
    }
    
    public static boolean subTree(BinaryTreeNode node1, BinaryTreeNode node2) {
        
        if ( node2 == null ) {
            return true;
        }
        
        return matchTree(node1, node2) || matchTree(node1.left, node2) || matchTree(node1.right, node2);
        
    }
    
}

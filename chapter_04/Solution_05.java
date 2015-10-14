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
public class Solution_05 {
    
    public static boolean checkBST(BinaryTreeNode node) {
        return checkBSTHelper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public static boolean checkBSTHelper(BinaryTreeNode node, int min, int max) {
        
        if (node == null) {
            return true;
        }
        
        if ( !(node.value > min && node.value <= max) ) {
            return false;
        } else {
            return checkBSTHelper(node.left, min, node.value) &&
                   checkBSTHelper(node.right, node.value, max);
        }
        
    }
    
}

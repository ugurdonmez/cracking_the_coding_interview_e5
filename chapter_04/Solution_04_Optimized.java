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
public class Solution_04_Optimized {
    
    public static boolean checkBalanced(BinaryTreeNode node) {
        return getHeight(node) != -1;
    }
    
    public static int getHeight(BinaryTreeNode node) {
        if ( node == null ) {
            return 0;
        }
        
        int left = getHeight(node.left);
        if (left == -1) {
            return -1;
        }
        
        int right = getHeight(node.right);
        if (right == -1) {
            return -1;
        }
        
        if ( Math.abs(left-right) > 1 ) {
            return -1;
        }
        
        return left > right ? left + 1 : right + 1;
    }
}

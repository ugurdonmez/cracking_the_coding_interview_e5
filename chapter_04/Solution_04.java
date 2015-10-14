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
public class Solution_04 {
    
    public static boolean checkBalanced(BinaryTreeNode node) {
        
        if (node == null) {
            return true;
        }
        
        int left = Solution_04.getDepth(node.left);
        int right = Solution_04.getDepth(node.right);
        
        if (Math.abs(left-right) > 1) {
            return false;
        }
        
        return checkBalanced(node.left) && checkBalanced(node.right);
        
    }
    
    public static int getDepth(BinaryTreeNode node) {
        
        if (node == null) {
            return 0;
        } else {
            int left = getDepth(node.left);
            int right = getDepth(node.right);
            
            if (left > right) {
                return left + 1;
            } else {
                return right + 1;
            }
        }
    }
    
}

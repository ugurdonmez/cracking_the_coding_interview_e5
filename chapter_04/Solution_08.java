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
public class Solution_08 {
    
    public static BinaryTreeNode firstCommonAncestor(BinaryTreeNode root, BinaryTreeNode x, BinaryTreeNode y) {
        
        boolean leftInclude = isInclude(root.left, x) && isInclude(root.left, y);
        
        if(leftInclude == true) {
            return firstCommonAncestor(root.left, x, y);
        }
        
        boolean rightInclude = isInclude(root.right, x) && isInclude(root.right, y);
        
        if(rightInclude == true) {
            return firstCommonAncestor(root.right, x, y);
        }
        
        return root;
        
    }
    
    public static boolean isInclude(BinaryTreeNode root, BinaryTreeNode x) {
        if (root == null ) {
            return false;
        }
        
        if (root.equals(x)) {
            return true;
        }
        
        return isInclude(root.left, x) || isInclude(root.right, x);
        
    }
    
}

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
public class Solution_06 {
    
    public static int successorBST(BinaryTreeNodeParent node) throws Exception {
        
        if (node.right != null) {
            return getMinimum(node.right);
        }
        
        BinaryTreeNodeParent parent = node.parent;
        
        while( parent != null && parent.right == node ) {
            node = parent;
            parent = node.parent;
        }
        
        if (parent != null) {
            return parent.value;
        } else {
            throw new Exception();
        }
        
        
    }
    
    public static int getMinimum(BinaryTreeNodeParent node) {
        while(node.left != null) {
            node = node.left;
        }
        
        return node.value;
    }
    
    
}
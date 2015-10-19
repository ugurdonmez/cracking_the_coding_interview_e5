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
public class Solution_12 {
    
    public int countPathsWithSum( BinaryTreeNode node, int target ) {
        
        if ( node == null ) {
            return 0;
        }
        
        int countFromNode = countPathsWithSumFromNode(node, target, 0);
        
        int countLeft = countPathsWithSum(node.left, target);
        int countRight = countPathsWithSum(node.right, target);
        
        return countFromNode + countLeft + countRight;
        
    }
    
    public int countPathsWithSumFromNode ( BinaryTreeNode node, int target, int current) {
        
        if ( node == null ) {
            return 0;
        }
        
        current += node.value;
        
        int path = 0;
        
        if ( current == target ) {
            path++;
        }
        
        path += countPathsWithSumFromNode(node.left, target, current);
        path += countPathsWithSumFromNode(node.right, target, current);
        
        return path;
    } 
    
}

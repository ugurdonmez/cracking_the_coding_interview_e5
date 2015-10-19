/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.Random;

/**
 *
 * @author ugurdonmez
 */
public class Solution_11 {
    
    
}

class Tree {
    
    TreeNode root = null;
    
    public int size() {
        return root == null ? 0 : root.size;
    }
    
    public TreeNode getRandomNode() {
        if ( root == null ) {
            return null;
        }
        
        Random random = new Random();
        
        int i = random.nextInt(this.size());
        return this.root.getNode(i);
    }
}

class TreeNode {
    
    private int data;
    
    public TreeNode left;
    public TreeNode right;
    
    public int size = 0;
    
    public TreeNode(int data) {
        this.data = data;
        this.size = 1;
    }
    
    public TreeNode getNode(int i) {
        
        int left_size = this.left == null ? 0 : left.size;
        
        if ( i < left_size ) {
            return left.getNode(i);
        } else if ( left_size == i ) {
            return this;
        } else {
            return right.getNode(i - left_size - 1);
        }
    }
}

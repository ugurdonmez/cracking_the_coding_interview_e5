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
public class BinaryTreeNodeParent {
    
    int value;
    BinaryTreeNodeParent left;
    BinaryTreeNodeParent right;
    BinaryTreeNodeParent parent;
    
    public BinaryTreeNodeParent(int value, BinaryTreeNodeParent parent) {
        this.value = value;
        this.parent = parent;
    }
    
}

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
public class BinaryTreeNode {
    
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;
    
    public BinaryTreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public void insert(int value) {
        
        if ( value < this.value ) {
            if (this.left != null) {
                this.left.insert(value);
            } else {
                this.left = new BinaryTreeNode(value);
            }
        } else {
            if (this.right != null) {
                this.right.insert(value);
            } else {
                this.right = new BinaryTreeNode(value);
            }
        }
    }
    
    public static void inorder(BinaryTreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.value);
            inorder(node.right);
        }
    }
    
    public static void preorder(BinaryTreeNode node) {
        if (node != null) {
            System.out.println(node.value);
            preorder(node.left);
            preorder(node.right);
        }
    }
    
    public static void postorder(BinaryTreeNode node) {
        if (node != null) {
            preorder(node.left);
            preorder(node.right);
            System.out.println(node.value);
        }
    }
}

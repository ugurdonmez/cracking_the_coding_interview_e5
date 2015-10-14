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
public class TestTraversals {
    
    public static void main(String [] args) {
        BinaryTreeNode node = new BinaryTreeNode(10);
        
        node.insert(1);
        node.insert(2);
        node.insert(3);
        node.insert(4);
        node.insert(5);
        node.insert(6);
        node.insert(15);
        node.insert(11);
        node.insert(12);
        node.insert(13);
        node.insert(16);
        node.insert(17);
        node.insert(18);
        node.insert(19);
        node.insert(25);
        node.insert(24);
        
        BinaryTreeNode.inorder(node);
        System.out.println("-----");
        BinaryTreeNode.preorder(node);
        System.out.println("-----");
        BinaryTreeNode.postorder(node);
        
        
    }
    
}

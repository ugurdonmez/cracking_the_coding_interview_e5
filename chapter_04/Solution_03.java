/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.LinkedList;

/**
 *
 * @author ugurdonmez
 */
public class Solution_03 {
    
    public static LinkedList<LinkedList<BinaryTreeNode>> listOfDepth(BinaryTreeNode node) {
        
        LinkedList<LinkedList<BinaryTreeNode>> lists = new LinkedList<>();
        
        listOfDepthHelper(node, 0, lists);
        
        return lists;
    }
    
    public static void listOfDepthHelper(BinaryTreeNode node, int level, LinkedList<LinkedList<BinaryTreeNode>> lists) {
        
        if(node == null) {
            return;
        }
        
        LinkedList<BinaryTreeNode> list;
        
        if ( lists.size() <= level ) {
            list = new LinkedList<>();
        } else {
            list = lists.get(level);
        }
        
        list.add(node);
        lists.add(list);
        
        listOfDepthHelper(node.left, level+1, lists);
        listOfDepthHelper(node.right, level+1, lists);
        
    }
    
}

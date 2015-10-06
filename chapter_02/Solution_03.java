package chapter_02;


import chapter_02.LinkedList;
import chapter_02.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ugurdonmez
 */
public class Solution_03 {
    
    
    // you can access the head node
    public static void deleteMiddle(LinkedList list) {
        
        Node firstIterator = list.head;
        Node secondIterator = list.head;
        
        while( firstIterator.next != null && firstIterator.next.next != null ) {            
            firstIterator = firstIterator.next.next;
            secondIterator = secondIterator.next;
        }
        
        // assume that all nodes have different data
        // this is not efficient way because deleteNode method iterate over to the middle again
        list.deleteNode(secondIterator.data);
        
    }
    
    public static void deleteMiddleAccessHeadNotAllowd(Node node) {
        
        if (node == null || node.next == null) {
            return;
        }
        
        node.data = node.next.data;        
        node.next = node.next.next;
        
    }
    
    
    
    public static void main ( String [] args ) {
        
        LinkedList list = new LinkedList();
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(4));
        list.addToEnd(new Node(5));
        list.addToEnd(new Node(6));
        list.addToEnd(new Node(7));
        list.addToEnd(new Node(8));
        
        System.out.println(list);
        
        Solution_03.deleteMiddle(list);
        System.out.println(list);
        
        
        
        
    }
    
}

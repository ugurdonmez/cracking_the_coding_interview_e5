/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_02;

/**
 *
 * @author ugurdonmez
 */
public class TestLinkedList {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.addToEnd(new Node(1));
        System.out.println(list);
        
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(4));
        System.out.println(list);
        
        list.deleteNode(1);
        System.out.println(list);
        
        list.deleteNode(2);
        list.deleteNode(4);
        System.out.println(list);
        
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(4));
        list.addToEnd(new Node(1));
        System.out.println(list);
        
        Solution_01_a.removeDuplicates(list);
        System.out.println(list);
        
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(4));
        list.addToEnd(new Node(1));
        System.out.println(list);
        
        Solution_01_b.removeDuplicates(list);
        System.out.println(list);
    }
    
}

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
public class Solution_04 {
    
    public static void partition(LinkedList list, int value) {
        
        Node small = null;
        Node big = null;
        
        Node next;
        Node current = list.head;
        
        // partition
        while(current != null) {
            next = current.next;
            
            if(current.data < value) {
                current.next = small;
                small = current;
            } else {
                current.next = big;
                big = current;
            }
            
            current = next;
        }
        
        // merge
        list.head = small;
        current = small;
        
        while(current.next!=null) {
            current = current.next;
        }
        current.next = big;
    }
    
    public static void main (String [] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(new Node(11));
        list.addToEnd(new Node(23));
        list.addToEnd(new Node(13));
        list.addToEnd(new Node(4));
        list.addToEnd(new Node(5));
        list.addToEnd(new Node(46));
        list.addToEnd(new Node(17));
        list.addToEnd(new Node(8));
        
        System.out.println(list);
        Solution_04.partition(list, 10);
        System.out.println(list);
    }
    
}

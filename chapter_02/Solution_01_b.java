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

// remove duplicates without using additional ds
public class Solution_01_b {
    
    public static void removeDuplicates(LinkedList list) {
        
        Node current = list.head;
        
        while( current != null ) {
            Node inner = current;
            
            while( inner.next != null  ) {
                if ( inner.next.data == current.data ) {
                    inner.next = inner.next.next;
                } else {
                    inner = inner.next;
                }
            }
            current = current.next;
        }
        
    }
    
}

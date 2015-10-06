/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_02;

import java.util.Hashtable;

/**
 *
 * @author ugurdonmez
 */

// remove duplicates
public class Solution_01_a {
    
    public static void removeDuplicates(LinkedList list) {
        
        Hashtable<Integer,Boolean> table = new Hashtable();
        
        Node head = list.head;
        // empty list
        if (head == null) {
            return;
        }
        
        Node current = head;
        table.put(current.data, Boolean.TRUE);
        while(current.next != null) {
            if(table.containsKey(current.next.data)) {
                current.next = current.next.next;
            } else {
                table.put(current.next.data, Boolean.TRUE);
                current = current.next;
            }
        }
    }
    
}

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
public class Solution_06 {
    
    public static Node findLoopStart(LinkedList list) {
        
        Node fast = list.head;
        Node slow = list.head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            // collision
            if (slow == fast) {
                break;
            }
        }
        
        slow = list.head;
        
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_02;

import java.util.Stack;

/**
 *
 * @author ugurdonmez
 */
public class Solution_07 {
    
    public static boolean isPalindrome(LinkedList list) {
        
        Stack<Integer> stack = new Stack();
        Node fast = list.head;
        Node slow = list.head;
        
        while(fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // skip middle
        if (fast != null) {
            slow = slow.next;
        }
        
        while(slow != null) {
            if(slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        
        return true;
        
    }
    
    public static void main (String [] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        //list.addToEnd(new Node(4));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(1));
        //list.addToEnd(new Node(0));
        
        
        System.out.println(list);
        System.out.println( Solution_07.isPalindrome(list) );
        
    }
    
}

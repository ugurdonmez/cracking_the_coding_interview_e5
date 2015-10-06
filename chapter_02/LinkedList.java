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
public class LinkedList {
    
    Node head;
    
    public LinkedList() {
        head = null;
    }
    
    public void addToEnd(Node node) {
        Node current = head;

        // add to head
        if (current == null) {
            head = node;
            return;
        }
        
        while(current.next != null) {
            current = current.next;
        }
        
        current.next = node;
    }
    
    public boolean deleteNode(int data) {
        // delete from head
        if (head == null) {
            return false;
        } else if (head.data == data) {
            head = head.next;
            return true;
        }
        
        Node current = head;
        while ( current.next != null ) {
            if ( current.next.data == data ) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        
        return false;  
    }
    
    @Override
    public String toString() {
        Node current = head;
        
        StringBuilder buff = new StringBuilder();
        while(current != null) {
            buff.append(current.data).append(" ");
            current = current.next;
        }
        
        return buff.toString();
    }
    
}

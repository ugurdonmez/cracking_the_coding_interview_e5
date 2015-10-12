/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_03;

/**
 *
 * @author ugurdonmez
 */
public class Stack {
    
    Node head;
    
    public Stack() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int peak() throws Exception {
        if (isEmpty() == false) {
            return head.data;
        } else {
            throw new Exception("Stack is empty");
        }
    }
    
    public int pop() throws Exception {
        if(isEmpty() == false) {
            int value = head.data;
            head = head.next;
            return value;
        } else {
            throw new Exception("Stack is empty");
        }
    }
    
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
}

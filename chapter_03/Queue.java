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
public class Queue {
    
    Node first;
    Node last;
    
    public Queue() {
        first = null;
        last = null;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void enqueue(int data) {
        Node node = new Node(data);
        
        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }
    
    public int dequeue() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty.");
        } else {
            int value = first.data;
            first = first.next;
            return value;
        }
    }
    
}

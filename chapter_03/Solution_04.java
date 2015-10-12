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
class MyQueue{ 
    
    Stack front;
    Stack back;
    
    public MyQueue() {
        front = new Stack();
        back = new Stack();
    }
    
    public void enqueue(int n) throws Exception {
        while(!front.isEmpty()) {
            back.push(front.pop());
        }
        
        back.push(n);
    }
    
    public int dequeue() throws Exception {
        while(!back.isEmpty()) {
            front.push(back.pop());
        }
        
        return front.pop();
    }   
}


public class Solution_04 {
    
    public static void main (String [] args) throws Exception {
        
        MyQueue queue = new MyQueue();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
    
}

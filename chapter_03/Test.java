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
public class Test {
    
    public static void main (String [] args) throws Exception {
        
        System.out.println("stack");
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        
        System.out.println("queue");
        
        Queue queue = new Queue();
        
        queue.enqueue(1);
        System.out.println(queue.dequeue());
        
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        
        
        
        
    }
    
}

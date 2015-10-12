/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_03;

import java.util.ArrayList;

/**
 *
 * @author ugurdonmez
 */
public class Solution_03_a {
    
    public static void main (String [] args) throws Exception {
        SetOfStack stack = new SetOfStack(3);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.push(6);
        stack.push(7);
        stack.push(8);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.push(6);
        stack.push(7);
        stack.push(8);
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        
    }
    
}

class SetOfStack {
    
    int maxSize;
    int currentSize;
    int currentStack;
    ArrayList<Stack> stacks;
    
    public SetOfStack(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.currentStack = 0;
        stacks = new ArrayList<>();
        stacks.add(new Stack());
    }
    
    public void push(int n) {
        stacks.get(currentStack).push(n);
        currentSize++;
        
        if (currentSize == maxSize) {
            stacks.add(new Stack());
            currentStack++;
            currentSize = 0;
        }
    }
    
    public int pop() throws Exception {
        if(currentSize != 0) {
            currentSize--;
            return stacks.get(currentStack).pop();
        } else {
            currentSize = maxSize - 1;
            stacks.remove(currentStack);
            currentStack--;
            return stacks.get(currentStack).pop();
        }
    }
    
}

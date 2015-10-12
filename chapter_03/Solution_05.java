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
class SortStack {
    
    Stack sorted;
    Stack stack;
    
    public SortStack() {
        sorted = new Stack();
        stack = new Stack();
    }
    
    public void sort() throws Exception {
        while(!stack.isEmpty()) {
            int value = stack.pop();
            if(sorted.isEmpty()) {
                sorted.push(value);
            } else {
                // sorted peak bigger
                if (sorted.peak() >= value) {
                    sorted.push(value);
                } else {
                    while(!sorted.isEmpty() && sorted.peak() < value) {
                        stack.push(sorted.pop());
                    }
                    sorted.push(value);
                }
            }
        }
    }
}

public class Solution_05 {
    
}

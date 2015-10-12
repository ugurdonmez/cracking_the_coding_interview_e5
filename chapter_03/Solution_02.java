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
public class Solution_02 {
    
    Stack stackNumber;
    Stack stackMins;
    
    public Solution_02() {
        stackNumber = new Stack();
        stackMins = new Stack();
    }
    
    public void push(int n) throws Exception {
        
        stackNumber.push(n);
        
        if ( !stackMins.isEmpty() ) {
            if ( stackMins.peak() >= n ) {
                stackMins.push(n);
            }
        } else {
            stackMins.push(n);
        } 
    }
    
    public int pop() throws Exception {
        
        int value = stackNumber.pop();
        
        if ( value == stackMins.peak() ) {
            stackMins.pop();
        }
        
        return value;
        
    }
    
    public int min() throws Exception {
        return stackMins.peak();
    }
    
    public static void main (String [] args ) throws Exception {
        Solution_02 s = new Solution_02();
        
        s.push(5);
        s.push(1);
        s.push(1);
        
        s.pop();
        
        s.push(3);
        s.push(0);
        
        System.out.println(s.min());
        
        s.pop();
        System.out.println(s.min());
        
    }
}

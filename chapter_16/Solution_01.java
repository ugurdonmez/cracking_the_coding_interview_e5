/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_16;

/**
 *
 * @author ugurdonmez
 */
public class Solution_01 {
    
    public static void main(String [] args){
        
        int a = 9;
        int b = 5;
        
        a = a - b;
        b = a + b;
        a = b - a;
        
        System.out.println("a = " + a + " b = " + b);
        
    }
    
}

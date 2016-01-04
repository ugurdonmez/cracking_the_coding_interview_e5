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
public class Solution_05 {
    
    public static void main ( String [] args ) {
        
        System.out.println(getFactorialZero(25));
        System.out.println(getFactorialZero(12));
        System.out.println(getFactorialZero(2));
        System.out.println(getFactorialZero(14));
        
    }
    
    public static int getFactorialZero(int number) {
        
        int sum = 0;
        int power = 1;
        
        while ( number >= intPower(5, power) ) {
            sum = sum + number / intPower(5, power);
            power++;
        }
        
        return sum;
    }
    
    public static int intPower(int x, int y) {
        
        int p = 1;
        
        for ( int i = 0 ; i < y ; i++ ) {
            p *= x;
        }
        
        return p;
    }
}

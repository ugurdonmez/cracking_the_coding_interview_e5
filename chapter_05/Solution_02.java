/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_05;

/**
 *
 * @author ugurdonmez
 */
public class Solution_02 {
    
    public static String binaryToString(double number) {
        
        if (number > 1 || number < 0) {
            return "ERROR.";
        }
        
        int counter = -1;
        StringBuilder buff = new StringBuilder();
        
        while (number > 0) {
            
            if (buff.length() > 32) {
                return "ERROR.";
            }
            
            if (number > Math.pow(2, counter)) {
                buff.append("1");
                number -= Math.pow(2, counter);
            } else {
                buff.append("0");
            }
            
            counter--;
           
        }
        
        return buff.toString();
        
    } 
    
}

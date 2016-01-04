/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_16;

import java.util.HashMap;

/**
 *
 * @author ugurdonmez
 */
public class Solution_02 {
     
    public static HashMap<String, Integer> createMap(String [] book) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for ( String s : book ) {
            
            if (map.containsKey(s)) {
                map.put(s, map.get(s)+1);
            } else {
                map.put(s, 1);
            }
            
        }
        
        return map;
    }
    
    public static int getFrequency(HashMap<String, Integer> map, String s) {
        
        if (map.containsKey(s)) {
            return map.get(s);
        } else {
            return 0;
        }
        
    }
    
}

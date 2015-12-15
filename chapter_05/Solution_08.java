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
public class Solution_08 {
    
    public static void main(String [] args) {
        byte b = (byte) 1;
        
        byte [] bytes = new byte[32];
        
        for ( int i = 0 ; i < bytes.length ; i++ ) {
            bytes[i] = (byte) i;
        }
        
        System.out.println(printArray(bytes, 16));
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        drawLine(bytes, 16, 5, 10, 0);
        
        System.out.println(printArray(bytes, 16));
        
    }
    
    public static void drawLine( byte[] screen, int width, int x1, int x2, int y ) {
        
        int start = ( width - y - 1 ) * width / 8;
        
        for ( int i = x1 ; i <= x2 ; i++ ) {
            screen[ start + i / 8 ] = setBit( screen[ start + i / 8 ], i % 8);
        }
        
    }
    
    public static byte setBit( byte b , int bit ) {
        return (byte) (b | (byte) Math.pow(2, (8-bit+1)));
    }
    
    public static String printArray( byte [] bytes, int width ) {
        
        StringBuilder buff = new StringBuilder();
        
        for ( int i = width - 1 ; i >= 0 ; i-- ) {
            int start = ( width - i - 1 ) * width / 8;
            
            for ( int j = start ; j < start + width / 8 ; j++ ) {
                buff.append(printByte(bytes[j]));
            }
            
            buff.append("\n");
        }
        
        return buff.toString();
    }
    
    public static String printByte(byte b) {
        
        StringBuilder buff = new StringBuilder(String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0'));
        
        return buff.reverse().toString();
    }
    
}

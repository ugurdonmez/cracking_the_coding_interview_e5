package chapter_02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ugurdonmez
 */
public class Solution_02 {
    
    public static int findKthLastElement(LinkedList list, int k) {
        
        Node firstIterator = list.head;
        Node secondIterator = list.head;
        
        for ( int i = 0 ; i < k-1 ; i++ ) {
            if ( firstIterator.next != null ) {
                firstIterator = firstIterator.next;
            }
        }
        
        while( firstIterator.next != null ) {            
            firstIterator = firstIterator.next;
            secondIterator = secondIterator.next;
        }
        
        return secondIterator.data;
        
    }
    
    public static void main ( String [] args ) {
        
        LinkedList list = new LinkedList();
        list.addToEnd(new Node(1));
        list.addToEnd(new Node(2));
        list.addToEnd(new Node(3));
        list.addToEnd(new Node(4));
        list.addToEnd(new Node(5));
        list.addToEnd(new Node(6));
        list.addToEnd(new Node(7));
        
        System.out.println(list);
        
        System.out.println( Solution_02.findKthLastElement(list, 2) );
        System.out.println( Solution_02.findKthLastElement(list, 3) );
        System.out.println( Solution_02.findKthLastElement(list, 4) );
        
        
    }
    
}

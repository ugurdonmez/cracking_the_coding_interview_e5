/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_02;

/**
 *
 * @author ugurdonmez
 */
public class Solution_05_a {
    
    public static LinkedList sum(LinkedList list1, LinkedList list2) {
        
        LinkedList result = new LinkedList();
        
        int carier = 0;
        int n1;
        int n2;
        int sum;
        
        Node it1 = list1.head;
        Node it2 = list2.head;
        
        while( it1 != null || it2 != null ) {
            if(it1 != null) {
                n1 = it1.data;
                it1 = it1.next;
            } else {
                n1 = 0;
            }
            
            if(it2 != null) {
                n2 = it2.data;
                it2 = it2.next;
            } else {
                n2 = 0;
            }
            
            sum = n1 + n2 + carier;
            
            result.addToEnd( new Node( sum % 10));
            carier = sum / 10;
        }
        
        if (carier != 0) {
            result.addToEnd(new Node(carier));
        }
        
        return result;
    }
    
    public static void main (String [] args ) {
        LinkedList list1 = new LinkedList();
        list1.addToEnd(new Node(9));
        list1.addToEnd(new Node(3));
        list1.addToEnd(new Node(2));
        list1.addToEnd(new Node(2));
        
        LinkedList list2 = new LinkedList();
        list2.addToEnd(new Node(1));
        list2.addToEnd(new Node(3));
        list2.addToEnd(new Node(2));
        
        LinkedList list3 = Solution_05_a.sum(list1, list2);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
    
}

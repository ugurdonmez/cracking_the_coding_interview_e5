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
public class Solution_05_b {
    
    public static int sum(LinkedList list1, LinkedList list2) {
                 
        int n1 = 0;
        int n2 = 0;
        int sum;
        
        Node it = list1.head;
        
        while(it != null){
            n1 = n1 * 10 + it.data;
            it = it.next;
        }
        
        it = list2.head;
        
        while(it != null){
            n2 = n2 * 10 + it.data;
            it = it.next;
        }
        
        // TODO: convert to list
        sum = n1 + n2;
        
        return sum;
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
        
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(Solution_05_b.sum(list1, list2));

    }
    
}

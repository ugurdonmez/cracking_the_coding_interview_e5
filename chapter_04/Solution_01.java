/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author ugurdonmez
 */
public class Solution_01 {
    
    public static boolean routeBetweenNodes(MyNode start, MyNode target) {
        
        Stack<MyNode> nodeStack = new Stack();
        Map<MyNode, Boolean> visited = new HashMap<>();
        
        nodeStack.push(start);
        
        while(!nodeStack.isEmpty()) {
            MyNode n = nodeStack.pop();
            if(visited.containsKey(n) && visited.get(n) == true) {
                continue;
            }
            
            // found
            if (n.equals(target)) {
                return true;
            }
            visited.put(n, Boolean.TRUE);
            
            n.children.stream().forEach((c) -> {
                nodeStack.push(c);
            });
        }
        
        return false;
    }
    
    public static void main(String [] args) {
        MyNode node0 = new MyNode("0");
        MyNode node1 = new MyNode("1");
        MyNode node2 = new MyNode("2");
        MyNode node3 = new MyNode("3");
        MyNode node4 = new MyNode("4");
        MyNode node5 = new MyNode("5");
        
        node0.children.add(node5);
        node0.children.add(node1);
        node0.children.add(node4);
        
        node1.children.add(node4);
        node1.children.add(node3);
        
        node2.children.add(node1);
        
        node3.children.add(node4);
        node3.children.add(node2);
        
        System.out.println("0 to 3");
        System.out.println(Solution_01.routeBetweenNodes(node0, node3));
        
        System.out.println("5 to 0");
        System.out.println(Solution_01.routeBetweenNodes(node5, node0));
        
        System.out.println("1 to 0");
        System.out.println(Solution_01.routeBetweenNodes(node1, node0));
        
    }
   
}

class MyNode {
    public String name;
    public ArrayList<MyNode> children;
    
    public MyNode(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ugurdonmez
 */
public class Graph {
    
    public Graph() {
        nodes = new ArrayList<>();
    }
    
    public ArrayList<Node> nodes;
    
    public static void breathFirstSearch(Node node) {
        
        Queue<Node> nodeQueue = new LinkedList<>();
        Map<Node, Boolean> visited = new HashMap<>();
        
        nodeQueue.add(node);
        
        while(!nodeQueue.isEmpty()) {
            
            Node n = nodeQueue.poll();
            if(!(visited.containsKey(n) && visited.get(n) == true)) {
                // visit node
                System.out.println(n.name);
                visited.put(n, Boolean.TRUE);
            }
            
            n.children.stream().forEach((c) -> {
                nodeQueue.add(c);
            });
        }
    }
    
    public static void depthFirstSearchIterative(Node node) {
        
        Stack<Node> nodeStack = new Stack();
        Map<Node, Boolean> visited = new HashMap<>();
        
        nodeStack.push(node);
        
        while(!nodeStack.isEmpty()) {
            Node n = nodeStack.pop();
            if(visited.containsKey(n) && visited.get(n) == true) {
                continue;
            }
            
            System.out.println(n.name);
            visited.put(n, Boolean.TRUE);
            
            n.children.stream().forEach((c) -> {
                nodeStack.push(c);
            });
        }
        
    }
    
    public static void depthFirstSearch(Node node) {
        
        Map<Node, Boolean> visited = new HashMap<>();
        depthFirstSearchHelper(node, visited);
        
    }
    
    public static void depthFirstSearchHelper(Node node, Map<Node, Boolean> visited) {
        if (node == null) {
            return;
        }
        
        if(visited.containsKey(node) && visited.get(node) == true) {
            return;
        }
        
        System.out.println(node.name);
        visited.put(node, Boolean.TRUE);
        
        node.children.stream().forEach((n) -> {
            depthFirstSearchHelper(n, visited);
        });
    }
    
    public static void main(String [] args) {
        Node node0 = new Node("0");
        Node node1 = new Node("1");
        Node node2 = new Node("2");
        Node node3 = new Node("3");
        Node node4 = new Node("4");
        Node node5 = new Node("5");
        
        node0.children.add(node5);
        node0.children.add(node1);
        node0.children.add(node4);
        
        node1.children.add(node4);
        node1.children.add(node3);
        
        node2.children.add(node1);
        
        node3.children.add(node4);
        node3.children.add(node2);
        
        System.out.println("DFS Recursion");
        Graph.depthFirstSearch(node5);
        
        System.out.println("DFS Iterative");
        Graph.depthFirstSearchIterative(node0);
        
        System.out.println("BFS");
        Graph.breathFirstSearch(node0);
        
    }
    
}

class Node {
    public String name;
    public ArrayList<Node> children;
    
    public Node(String name){
        this.name = name;
        this.children = new ArrayList<>();
    }
}

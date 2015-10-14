/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_04;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author ugurdonmez
 */
public class Solution_07 {
    
    public static void main (String [] args) {
        
        Node nodea = new Node("a");
        Node nodeb = new Node("b");
        Node nodec = new Node("c");
        Node noded = new Node("d");
        Node nodee = new Node("e");
        Node nodef = new Node("f");
        
        nodea.children.add(noded);
        
        nodeb.children.add(noded);
        
        noded.children.add(nodec);
        
        nodef.children.add(nodea);
        nodef.children.add(nodeb);
        
        Graph g = new Graph();
        g.nodes.add(nodea);
        g.nodes.add(nodeb);
        g.nodes.add(nodec);
        g.nodes.add(noded);
        g.nodes.add(nodee);
        g.nodes.add(nodef);
        
        Solution_07.topologicalSort(g);
        
    }
    
    public static void topologicalSort(Graph g) {
        
        Map<Node, Boolean> visited = new HashMap<>();
        Map<Node, Boolean> visiting = new HashMap<>();
        Boolean cycle = false;
        
        g.nodes.stream().forEach((n) -> {
            visited.put(n, Boolean.FALSE);
        });
        
        Queue<Node> nodeQueues = new LinkedList<>();
        topologicalSorthHelper(g.nodes.get(0), visited, visiting, nodeQueues, cycle);
        
        while(Boolean.TRUE) {
            Set<Node> keys = visited.keySet();
            Boolean con = false;
            for ( Node n : keys ) {
                if (Objects.equals(visited.get(n), Boolean.FALSE)) {
                    con = true;
                    topologicalSorthHelper(n, visited, visiting, nodeQueues, cycle);
                }
            }
            if(con == false) {
                break;
            } 
        }
        
        while (!nodeQueues.isEmpty()) {
            System.out.println(nodeQueues.poll().name);
        }
        
    }
    
    public static void topologicalSorthHelper(Node node, Map<Node, Boolean> visited, Map<Node, Boolean> visiting, Queue<Node> nodeQueues, Boolean cycle) {

        if (node == null) {
            return;
        }
        
        if(visited.containsKey(node) && visited.get(node) == true) {
            return;
        }
        
        // TODO: there is a cycle
        // TODO: do it with return
        if(visiting.containsKey(node) && visiting.get(node) == true) {
            //cycle = true;
            return;
        }
        
        visiting.put(node, Boolean.TRUE);
        
        node.children.stream().forEach((n) -> {
            topologicalSorthHelper(n, visited, visiting, nodeQueues, cycle);
        });
        
        nodeQueues.add(node);
        visited.put(node, Boolean.TRUE);
    }
    
}

package it.unibo.generics.graph.impl;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import it.unibo.generics.graph.api.Graph;
import java.util.Queue;

public class GraphImpl<N> implements Graph<N>{

    private Map<N, ArrayList<N> > graph = new HashMap<>();

    public void addNode(N node){
        graph.put(node, new ArrayList<>());
    }

    public void addEdge (N source , N target ){
        graph.get(source).add(target);
    }

    public Set<N> nodeSet (){
        return graph.keySet();
    }

    public Set<N> linkedNodes (N node ){
        return new HashSet<>(graph.get(node));

    }

    public List <N> getPath (N source , N target ){ 
       
        Queue<N> queue = new LinkedList<>();
        Set<N> visited = new HashSet<>();
        Map<N,N> fathers = new HashMap<>();
        queue.add(source);
        visited.add(source);


        while(queue.peek() != null){
            N u = queue.poll();
            if(u==target){
                break;
            }

            for(N n : graph.get(u)){
                if(!visited.contains(n)){
                    visited.add(n);
                    queue.add(n);
                    fathers.put(u,n);
                }
                
            }
        }

         List <N> path = new ArrayList<>();
         N gettingPath = source;

         while(gettingPath!=null){
            path.add(gettingPath);
            gettingPath = fathers.get(gettingPath);
         }

         return path;
    }

}
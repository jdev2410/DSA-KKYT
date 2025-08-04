package com.dsa.learning.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphBasic {
    public static void bfs(List<List<Integer>> list, int node) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];
        visited[node] = true;
        q.add(node);
        while (!q.isEmpty()) {
           int currentNode= q.poll();
            System.out.println(currentNode);
            for(Integer i: list.get(currentNode)){
                if(!visited[i]){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2));
        list.add(List.of(0));
        list.add(List.of(0, 3));
        list.add(List.of(2));
        bfs(list,0);
    }
}

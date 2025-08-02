package ConceptualLearningOnGraphs;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BFSTraversal {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0;i<=4; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(4);
        adj.get(1).add(0);
        adj.get(1).add(4);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(4);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(4).add(2);
        adj.get(4).add(3);

        ArrayList < Integer > ans = bfsOfGraph(5, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }

    }

    private static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // the bfs result
        ArrayList<Integer> bfs = new ArrayList<Integer>();
        // visited array
        // as in question it is Zero based indexing -> soo the array size will be equal to V
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        // as starting node is 'zero' here
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            for(Integer it: adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}

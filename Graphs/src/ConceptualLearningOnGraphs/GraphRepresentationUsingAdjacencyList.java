package ConceptualLearningOnGraphs;

import java.util.ArrayList;

public class GraphRepresentationUsingAdjacencyList {
    public static void main(String[] args) {
        // below is for undirected graph

        int n = 3, m = 3;
        //initialise ArrayList inside ArrayList for n+1
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        /*
        0 - {}
        1 - {}
        2 - {}
        3 - {}
        to add ArrayList for each value of ArrayList we will run a loop from 0->n
         */

        //n+1
        // 0 1 2 3
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }

        //edge 1-2
        adj.get(1).add(2);
        adj.get(2).add(1);

        //edge 2-3
        adj.get(2).add(3);
        adj.get(3).add(2);

        //edge 1-3
        adj.get(1).add(3);
        adj.get(3).add(1);

        //printing the adjacency list
        for(int i=1; i<=n; i++){
            for(int j=0; i<= adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }

        /*
        for directed graph -> only add the path which is needed.
         */
    }
}

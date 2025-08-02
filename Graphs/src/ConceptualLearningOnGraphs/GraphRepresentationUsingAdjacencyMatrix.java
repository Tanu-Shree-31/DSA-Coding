package ConceptualLearningOnGraphs;

public class GraphRepresentationUsingAdjacencyMatrix {
    public static void main(String[] args) {
        // below is for undirected graph
        int n = 3, m = 3;
        int adj[][] = new int[n+1][n+1];

        //edge 1-2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2-3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1-3
        adj[1][3] = 1;
        adj[3][1] = 1;

        /*
        Generalised form
        adj[u][v] = 1;
        adj[v][u] = 1;
         */

        /*
        for directed graph -> only add the path which is needed.
         */

    }
}

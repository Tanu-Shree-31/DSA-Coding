/*
Given an undirected graph with V nodes and E edges, create and return an adjacency list of the graph. 0-based indexing is followed everywhere.

Example 1:

Input:
V = 5, E = 7
edges = {(0,1),(0,4),(4,1),(4,3),(1,3),(1,2),(3,2)}

Output:
{{1,4},
 {0,2,3,4},
 {1,3},
 {1,2,4},
 {0,1,3}}
Explanation:
Node 0 is connected to 1 and 4.
Node 1 is connected to 0,2,3 and 4.
Node 2 is connected to 1 and 3.
Node 3 is connected to 1,2 and 4.
Node 4 is connected to 0,1 and 3.
Example 2:

Input:
V = 4, E = 3
edges = {(0,3),(0,2),(2,1)}


Output:
{{2,3}
 {2},
 {0,1}
 {0}}
Explanation:
Node 0 is connected to 2 and 3.
Node 1 is only connected to 2.
Node 2 is connected to 0 and 1.
Node 3 is only connected to 0.
Your task:
You don't need to read input or print anything. Your task is to complete the function printGraph() which takes the integer V denoting the number of vertices and edges as input parameters and returns the list of list denoting the adjacency list.

Expected Time Complexity: O(V + E)
Expected Auxiliary Space: O(V + E)

Constraints:
1 ≤ V, E ≤ 105
 */

package ConceptualLearningOnGraphs;

import java.io.*;
import java.util.*;
public class PrintAdjacencyList {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int edges[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                s = in.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(s[0]);
                edges[i][1] = Integer.parseInt(s[1]);
            }
            List<List<Integer>> A = printGraph(n, edges);
            for (var i : A) {
                Collections.sort(i);
                for (int j : i) {
                    out.print(j + " ");
                }
                out.println();
            }
        }
        out.close();
    }
    public static List<List<Integer>> printGraph(int V, int edges[][]) {
        // Initialize the adjacency list with V empty lists.
        List<List<Integer>> adjList = new ArrayList<>();

        // Create an empty list for each vertex.
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        // Add edges to the adjacency list
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // Since it's an undirected graph, add both connections.
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Return the adjacency list.
        return adjList;
    }
}

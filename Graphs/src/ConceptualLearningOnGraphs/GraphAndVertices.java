/*
Given an integer n representing number of vertices. Find out how many undirected graphs (not necessarily connected) can be constructed out of a given n number of vertices.



Example 1:

Input: 2
Output: 2
Example 2:

Input: 5
Output: 1024


Your Task:

Complete the function count() which takes an integer n as input and return the count of total number of graphs possible.



Expected Time Complexity: O(1)

Expected Space Complexity: O(1)



Constraints:

1<=n<=10
 */

package ConceptualLearningOnGraphs;

import java.io.IOException;
import java.util.Scanner;

public class GraphAndVertices {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();

            long ans = count(n);
            System.out.println(ans);
        }
    }

    static long count(int n) {
        //total edges possible
        /*
           since every node can be connected to n-1 other nodes so for n nodes total edges possible are n*(n-1) OR n*n(if

           self node is allowed) but since here undirected graph is being considered so edge from a to b would be same as edge

           from b to a and hence divided by 2;
        */
        int total_edges = n * (n - 1) / 2;
        //now for every edge we have two options whether to consider it or not
        return (long) Math.pow(2, total_edges);
    }
}



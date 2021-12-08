import java.util.*;
import java.lang.*;
import java.io.*;

public class KruskalsMST {
    public int vertices;
    public Edge[] edge, solution;
    public double startTime, endTime;

    public KruskalsMST(int v, int e) {
        vertices = v;
        edge = new Edge[e];

        for (int i = 0; i < e; ++i) {
            edge[i] = new Edge();
        }
    }

    public int find(Subset subsets[], int i) {


        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

    public void kruskalMST() {
        //Records the current time for timeComplexity()
        startTime = System.nanoTime();

        Edge solution[] = new Edge[vertices];

        // An index variable, used to iterate through solution[]
        int e = 0;

        // An index variable, used for sorted edges
        int i = 0;
        for (i = 0; i < vertices; ++i) {
            solution[i] = new Edge();
        }

        //Sorts all the edges based on their weight
        Arrays.sort(edge);

        Subset subsets[] = new Subset[vertices];
        for (i = 0; i < vertices; ++i) {
            subsets[i] = new Subset();
        }

        // Create vertices subsets with single elements
        for (int v = 0; v < vertices; ++v) {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        i = 0; // Index used to pick next edge

        // Number of edges to be taken in the MST equal to vertices - 1
        while (e < vertices - 1) {
            //Picks the smallest edge and increments the index variable
            Edge nextEdge = edge[i++];

            int x = find(subsets, nextEdge.source);
            int y = find(subsets, nextEdge.destination);

            // If including this edge doesn't cause cycle, include it in MST (solution[]) and increment the index variable
            if (x != y) {
                solution[e++] = nextEdge;
                Union(subsets, x, y);
            }
        }

        //Records the current time for timeComplexity()
        endTime = System.nanoTime();

        //Print the MST from solution[]
        System.out.println("The following code applies Kruskal's MST to a graph with " + vertices + " vertices. The MST contains edges:" );
        int minTrees = 0;

        System.out.println("Edge    Weight");
        for (i = 0; i < e; ++i) {
            System.out.println(solution[i].source + " - " + solution[i].destination  + "    " + solution[i].weight);
            minTrees += solution[i].weight;
        }
        System.out.println("Minimum Cost Spanning Tree " + minTrees);
        System.out.println("This ran in " + timeComplexity(startTime, endTime) + " millisecond");
        System.out.println();
    }




    //Represents the edges of a graph as a class
    public class Edge implements Comparable<Edge> {
        int source, destination, weight;

        // Compare function to sort edges by their weight
        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }
    public class Subset {
        int parent, rank;
    }

    public void Union(Subset subsets[], int x, int y) {
        int xR = find(subsets, x);
        int yR = find(subsets, y);

        //Union by rank
        if (subsets[xR].rank < subsets[yR].rank) {
            subsets[xR].parent = yR;
        }
        else if (subsets[xR].rank > subsets[yR].rank) {
            subsets[yR].parent = xR;
        }
        // If ranks are same, make one root and increment its rank
        else {
            subsets[yR].parent = xR;
            subsets[xR].rank++;
        }
    }

    public double timeComplexity(double start, double end) {
        return (double)((end - start) / 1000000);
    }

}
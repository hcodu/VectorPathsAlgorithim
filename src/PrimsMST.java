import java.util.*;
import java.lang.*;
import java.io.*;

    public class PrimsMST {
        // Number of vertices in the graph
        private static int vertices;
        private Boolean[] arrMST;
        private int[] parent, soltion;
        private int[][] inputGraph;
        int min = 99999;

        // A utility function to find the vertex with minimum key
        // value, from the set of vertices not yet included in MST

        public PrimsMST(int input[][], int vs) {
            vertices = vs;
            parent = new int[vertices];
            parent = new int[vertices];
            soltion = new int[vertices];
            arrMST = new Boolean[vertices];

            inputGraph = input;


        }


        int minKey(int key[], Boolean arrMST[]) {
            // Initialize min value
            int min = 99999;

            int min_index = -1;
            for (int v = 0; v < vertices; v++) {
                if (arrMST[v] == false && soltion[v] < min) {
                    min = key[v];
                    min_index = v;
                }
            }

            return min_index;
        }

        // A utility function to print the constructed MST stored in
        // parent[]
        public void printMST() {
            System.out.println("The following code applies Prim's MST for a graph with " + vertices  + " vertices.");
            System.out.println("Edge \t Weight");
            for (int i = 1; i < vertices; i++)
                System.out.println(parent[i] + " - " + i + " \t " + inputGraph[i][parent[i]]);
        }

        // Function to construct and print MST for a graph represented
        // using adjacency matrix representation
        public void primMST() {
            // Array to store constructed MST

            // Key values used to pick minimum weight edge in cut


            // To represent set of vertices included in MST

            // Initialize all keys as INFINITE
            for (int i = 0; i < vertices; i++) {
                soltion[i] = min;
                arrMST[i] = false;
            }

            // Always include first 1st vertex in MST.
            soltion[0] = 0; // Make key 0 so that this vertex is
            // picked as first vertex
            parent[0] = -1; // First node is always root of MST

            // The MST will have V vertices
            for (int count = 0; count < (vertices - 1); count++) {
                // Pick thd minimum key vertex from the set of vertices
                // not yet included in MST
                int u = minKey(soltion, arrMST);

                // Add the picked vertex to the MST Set
                arrMST[u] = true;

                // Update key value and parent index of the adjacent
                // vertices of the picked vertex. Consider only those
                // vertices which are not yet included in MST
                for (int v = 0; v < vertices; v++)

                    // graph[u][v] is non zero only for adjacent vertices of m
                    // mstSet[v] is false for vertices not yet included in MST
                    // Update the key only if graph[u][v] is smaller than key[v]
                    if (inputGraph[u][v] != 0 && arrMST[v] == false && inputGraph[u][v] < soltion[v]) {
                        parent[v] = u;
                        soltion[v] = inputGraph[u][v];
                    }
            }

            // print the constructed MST
            printMST();
        }


}

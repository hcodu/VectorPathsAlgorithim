import java.util.*;
import java.lang.*;
import java.io.*;

    public class PrimsMST {
        private static int vertices;
        private Boolean[] arrMST;
        private int[] parent, soltion;
        private int[][] inputGraph;
        int infinity = 99999;

        public PrimsMST(int input[][], int vs) {
            vertices = vs;
            parent = new int[vertices];
            parent = new int[vertices];
            soltion = new int[vertices];
            arrMST = new Boolean[vertices];
            inputGraph = input;
        }

        int shortestVector(int soltion[], Boolean arrMST[]) {
            // Initialize infinity value
            int infinity = 99999;

            //Find the index of the shortest vertex stemming from the current vertex that has not yet been visited by the MST algorithm
            int shortestIndex = -1;
            for (int v = 0; v < vertices; v++) {
                if (arrMST[v] == false && soltion[v] < infinity) {
                    infinity = soltion[v];
                    shortestIndex = v;
                }
            }
            return shortestIndex;
        }

        // A function to print the constructed MST from the primMST() method
        public void printMST() {
            System.out.println("The following code applies Prim's MST for a graph with " + vertices  + " vertices.");
            System.out.println("Edge    Weight");
            for (int i = 1; i < vertices; i++)
                System.out.println(parent[i] + " - " + i + "    " + inputGraph[i][parent[i]]);
        }

        // Function to construct the MST from the inputGraph[][], then calls the printMST() method to demonstrate
        public void primMST() {
            // Initialize of the solutions are as infinity
            for (int i = 0; i < vertices; i++) {
                soltion[i] = infinity;
                arrMST[i] = false;
            }

            // Start MST with the first vertex by setting the first vertex of the solution equal to 0.
            soltion[0] = 0;
            parent[0] = -1; // Sets first vertex is always beggining of MST

            // The MST will have "vertices" number of vertices
            for (int c = 0; c < (vertices - 1); c++) {
                // Pick the shortest vector from the current vertex to the set of vertices not yet visited by the MST algorithm
                int shortestVector = shortestVector(soltion, arrMST);

                // Add the picked (current shortest) vertex to the MST array
                arrMST[shortestVector] = true;

                // Updates solution value and parent index of the adjacent vertices of the picked vertex (but only the vertices which have not yet been visited by MST algorithm)
                for (int v = 0; v < vertices; v++) {
                    // mstSet[v] is false for vertices not yet visited by the MST algorithm. Updates the solutions only if inputGraph[u][v] is smaller than solution[v] (and vertex hasn't been added to the MST)
                    if (inputGraph[shortestVector][v] != 0 && arrMST[v] == false && inputGraph[shortestVector][v] < soltion[v]) {
                        parent[v] = shortestVector;
                        soltion[v] = inputGraph[shortestVector][v];
                    }
                }
            }

            //Prints the constructed MST
            printMST();
        }


}

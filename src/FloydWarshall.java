import java.util.*;
import java.lang.*;
import java.io.*;


    public class FloydWarshall {
        final int infinity = 99999;
        int vertices;
        int original[][];
        long startTime, endTime;


        public FloydWarshall(int inputGraph[][], int vs) {
            vertices = vs;
            original = inputGraph;


        }

        public void floydWarshall() {
            startTime = System.nanoTime();
            int solution[][] = new int[vertices][vertices];


            //Initalize solution matrix with input array
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    solution[i][j] = original[i][j];
                }
            }

            for (int k = 0; k < vertices; k++) {
                for (int i = 0; i < vertices; i++) {
                    for (int j = 0; j < vertices; j++) {
                        // If vertex k is on the shortest path from the previous vertice to the next, then update the value of solution[i][j] to the value of vector k
                        if (solution[i][k] + solution[k][j] < solution[i][j])
                            solution[i][j] = solution[i][k] + solution[k][j];
                    }
                }
            }

            endTime = System.nanoTime();


            System.out.println("The following code applies the Floyd Warshall algorithim for " + vertices + " vertices.");
            // Print the original weight array
            printOriginal(original);
            // Print the shortest distance array
            printSolution(solution);



        }

        public void printSolution(int[][] solution) {
            System.out.println("Solution array: ");
            for (int i = 0; i < vertices; i++) {
                for (int j=0; j < vertices; j++) {
                    if (solution[i][j]==infinity) {
                        System.out.print("INF ");
                    }
                    else {
                        System.out.print(solution[i][j] + "   ");
                    }
                }
                System.out.println();
            }
            System.out.println();


            //System.out.println("This completes in " + timeComplextity() + " ms");
        }

        public void printOriginal(int[][] original) {
            System.out.println("Original array: ");
            for (int i = 0; i < vertices; i++) {
                for (int j=0; j < vertices; j++) {
                    if (original[i][j] == infinity) {
                        System.out.print("INF ");
                    }
                    else {
                        System.out.print(original[i][j] + "   ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        public long timeComplextity() {
            System.out.println("Start: " + startTime + "  End:" + endTime + " " + " complexity: " + ((endTime - startTime) / 1000000));
            return (endTime - startTime);

        }

    }


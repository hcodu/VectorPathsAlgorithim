public class AlgorithimTester {
    public static void main(String[] args) {

        //Demonstrates various sizes vertice graphs and finds the shortest pair to every vertices using the Floyd Warshall Algorithim\

        final int infinity = 99999;

        int fourVerticeGraph[][] = {{0,       5,        infinity, 10      },
                                   {infinity, 0,        3,        infinity},
                                   {infinity, infinity, 0,        1       },
                                   {infinity, infinity, infinity, 0       }
        };
        FloydWarshall floydWarhsall4 = new FloydWarshall(fourVerticeGraph, 4);
        floydWarhsall4.floydWarshall();

        int fiveVerticeGraph[][] = {{0,       2,        1 ,       infinity, infinity},
                                   {infinity, 0,        infinity, 3,        5       },
                                   {infinity, infinity, 0,        5,        infinity},
                                   {infinity, infinity, infinity, 0,        infinity},
                                   {infinity, infinity, infinity, infinity, 0}      };

        FloydWarshall floydWarshall5 = new FloydWarshall(fiveVerticeGraph, 5);
        floydWarshall5.floydWarshall();

        int sixVerticeGraph[][] = {{0,       2 ,       1 ,       infinity, infinity, infinity},
                                  {infinity, 0,        infinity, 4,        3,        2       },
                                  {infinity, infinity, 0,        3,        infinity, infinity},
                                  {infinity, infinity, infinity, 0,        5,        infinity},
                                  {infinity, infinity, infinity, infinity, 0,        infinity},
                                  {infinity, infinity, infinity, infinity, 1,        0}};

        FloydWarshall floydWarhsall6 = new FloydWarshall(sixVerticeGraph, 6);
        floydWarhsall6.floydWarshall();


        //Demonstrates various size vertice graphs for finding the MST using Prim's algorithim

        int graph1[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                     { 2, 0, 3, 8, 5 },
                                     { 0, 3, 0, 0, 7 },
                                     { 6, 8, 0, 0, 9 },
                                     { 0, 5, 7, 9, 0 } };

        PrimsMST prims = new PrimsMST(graph1, 5);
        prims.primMST();

    }
}

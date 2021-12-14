public class AlgorithimTester {
    public static void main(String[] args) {

        //FLOYD WARHSALL
        //Demonstrates various sizes vertice graphs and finds the shortest pair to every vertices using the Floyd Warshall Algorithim\

        final int infinity = 99999;

        int[][] tenVGraph = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        tenVGraph[row][col] = rand;
                    }
                    else {
                        tenVGraph[row][col] = 99999;
                    }
                }
                //System.out.print(tenVGraph[row][col] + "\t");

            }
        }

        int[][] fiftyVGraph = new int[50][50];
        for(int row = 0; row < 50; row++) {
            for(int col = 0; col < 50; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        fiftyVGraph[row][col] = rand;
                    }
                    else {
                        fiftyVGraph[row][col] = 99999;
                    }
                }
               // System.out.print(fiftyVGraph[row][col] + "\t");

            }

        }

        int[][] oneHundredVGraph = new int[100][100];
        for(int row = 0; row < 100; row++) {
            for(int col = 0; col < 100; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        oneHundredVGraph[row][col] = rand;
                    }
                    else {
                        oneHundredVGraph[row][col] = 99999;
                    }
                }
                // System.out.print(fiftyVGraph[row][col] + "\t");

            }

        }


//        int fourVFloydGraph[][] = {{0,       5,        infinity, 10      },
//                                   {infinity, 0,        3,        infinity},
//                                   {infinity, infinity, 0,        1       },
//                                   {infinity, infinity, infinity, 0       }};
//
//        FloydWarshall floydWarhsall4 = new FloydWarshall(fourVFloydGraph, 4);
//        floydWarhsall4.floydWarshall();
//
//        int fiveVFloydGraph[][] = {{0,       2,        1 ,       infinity, infinity},
//                                   {infinity, 0,        infinity, 3,        5       },
//                                   {infinity, infinity, 0,        5,        infinity},
//                                   {infinity, infinity, infinity, 0,        infinity},
//                                   {infinity, infinity, infinity, infinity, 0}      };
//
//        FloydWarshall floydWarshall5 = new FloydWarshall(fiveVFloydGraph, 5);
//        floydWarshall5.floydWarshall();
//
//        int sixVFloydGraph[][] = {{0,       2 ,       1 ,       infinity, infinity, infinity},
//                                  {infinity, 0,        infinity, 4,        3,        2       },
//                                  {infinity, infinity, 0,        3,        infinity, infinity},
//                                  {infinity, infinity, infinity, 0,        5,        infinity},
//                                  {infinity, infinity, infinity, infinity, 0,        infinity},
//                                  {infinity, infinity, infinity, infinity, 1,        0}};

        FloydWarshall floydWarhsall10 = new FloydWarshall(tenVGraph, 10);
        floydWarhsall10.floydWarshall();

        FloydWarshall floydWarshall50 = new FloydWarshall(fiftyVGraph, 50);
        floydWarshall50.floydWarshall();

        FloydWarshall floydWarshall100 = new FloydWarshall(oneHundredVGraph, 100);
        floydWarshall100.floydWarshall();


        //PRIM'S
        //Demonstrates various size vertice graphs for finding the MST using Prim's algorithim

        int[][] twentyFiveHundredVGraph = new int[25][25];
        for(int row = 0; row < 25; row++) {
            for(int col = 0; col < 25; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        twentyFiveHundredVGraph[row][col] = rand;
                    }
                    else {
                        twentyFiveHundredVGraph[row][col] = 0;
                    }
                }

            }
        }
        PrimsMST twentyFiveVPrims = new PrimsMST(twentyFiveHundredVGraph, 25);
        twentyFiveVPrims.primMST();

        int[][] seventyFiveVGraph = new int[75][75];
        for(int row = 0; row < 75; row++) {
            for(int col = 0; col < 75; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        seventyFiveVGraph[row][col] = rand;
                    }
                    else {
                        seventyFiveVGraph[row][col] = 0;
                    }
                }
                //System.out.print(seventyFiveVGraph[row][col] + "\t");

            }
        }

        PrimsMST seventyFiveVPrims = new PrimsMST(seventyFiveVGraph, 75);
        seventyFiveVPrims.primMST();

        int[][] twoHundredFiftyVGraph = new int[250][250];
        for(int row = 0; row < 250; row++) {
            for(int col = 0; col < 250; col++) {
                if(row != col) {
                    int rand = (int) (Math.random() * 10) + 1;
                    if(rand <= 7) {
                        twoHundredFiftyVGraph[row][col] = rand;
                    }
                    else {
                        twoHundredFiftyVGraph[row][col] = 0;
                    }
                }
                //System.out.print(oneHundredFiftyVPrims[row][col] + "\t");

            }
        }
        PrimsMST twoHundredFiftyVPrims = new PrimsMST(twoHundredFiftyVGraph, 75);
        twoHundredFiftyVPrims.primMST();








        //KRUSKAL'S
        //Kruskal's for a 4 vertice, 5 edge graph
        KruskalsMST fourVKruskal = new KruskalsMST( 4, 5);

        // add edge 0-1
        fourVKruskal.edge[0].source = 0;
        fourVKruskal.edge[0].destination = 1;
        fourVKruskal.edge[0].weight = 10;
        // add edge 0-2
        fourVKruskal.edge[1].source = 0;
        fourVKruskal.edge[1].destination = 2;
        fourVKruskal.edge[1].weight = 6;
        // add edge 0-3
        fourVKruskal.edge[2].source = 0;
        fourVKruskal.edge[2].destination = 3;
        fourVKruskal.edge[2].weight = 5;
        // add edge 1-3
        fourVKruskal.edge[3].source = 1;
        fourVKruskal.edge[3].destination = 3;
        fourVKruskal.edge[3].weight = 15;
        // add edge 2-3
        fourVKruskal.edge[4].source = 2;
        fourVKruskal.edge[4].destination = 3;
        fourVKruskal.edge[4].weight = 4;

        fourVKruskal.kruskalMST();




        //Kruskal's for a 6 vertice, 9 edge graph
        KruskalsMST sixVKrustal = new KruskalsMST( 6,9);
        // add edge 0-1
        sixVKrustal.edge[0].source = 0;
        sixVKrustal.edge[0].destination = 1;
        sixVKrustal.edge[0].weight = 5;
        // add edge 1-2
        sixVKrustal.edge[1].source = 1;
        sixVKrustal.edge[1].destination = 2;
        sixVKrustal.edge[1].weight = 1;
        // add edge 0-3
        sixVKrustal.edge[2].source = 0;
        sixVKrustal.edge[2].destination = 3;
        sixVKrustal.edge[2].weight = 6;
        // add edge 1-3
        sixVKrustal.edge[3].source = 1;
        sixVKrustal.edge[3].destination = 3;
        sixVKrustal.edge[3].weight = 3;
        // add edge 3-2
        sixVKrustal.edge[4].source = 3;
        sixVKrustal.edge[4].destination = 2;
        sixVKrustal.edge[4].weight = 4;
        // add edge 3-4
        sixVKrustal.edge[5].source = 3;
        sixVKrustal.edge[5].destination = 4;
        sixVKrustal.edge[5].weight = 2;
        // add edge 2-4
        sixVKrustal.edge[6].source = 2;
        sixVKrustal.edge[6].destination = 4;
        sixVKrustal.edge[6].weight = 6;
        // add edge 2-5
        sixVKrustal.edge[7].source = 2;
        sixVKrustal.edge[7].destination = 5;
        sixVKrustal.edge[7].weight = 2;
        // add edge 4-5
        sixVKrustal.edge[8].source = 4;
        sixVKrustal.edge[8].destination = 5;
        sixVKrustal.edge[8].weight = 1;

        sixVKrustal.kruskalMST();




        //Kruskal's for a 7 vertices, 9 edge graph
        KruskalsMST sevenVKrustal = new KruskalsMST( 7, 9);
        //add edge 0-2
        sevenVKrustal.edge[0].source = 0;
        sevenVKrustal.edge[0].destination = 2;
        sevenVKrustal.edge[0].weight = 1;
        // add edge 0-1
        sevenVKrustal.edge[1].source = 0;
        sevenVKrustal.edge[1].destination = 1;
        sevenVKrustal.edge[1].weight = 2;
        // add edge 1-5
        sevenVKrustal.edge[2].source = 1;
        sevenVKrustal.edge[2].destination = 5;
        sevenVKrustal.edge[2].weight = 2;
        // add edge 1-4
        sevenVKrustal.edge[3].source = 1;
        sevenVKrustal.edge[3].destination = 4;
        sevenVKrustal.edge[3].weight = 3;
        // add edge 1-3
        sevenVKrustal.edge[4].source = 1;
        sevenVKrustal.edge[4].destination = 3;
        sevenVKrustal.edge[4].weight = 4;
        // add edge 2-3
        sevenVKrustal.edge[5].source = 2;
        sevenVKrustal.edge[5].destination = 3;
        sevenVKrustal.edge[5].weight = 3;
        // add edge 4-5
        sevenVKrustal.edge[6].source = 4;
        sevenVKrustal.edge[6].destination = 5;
        sevenVKrustal.edge[6].weight = 1;
        // add edge 4-6
        sevenVKrustal.edge[7].source = 4;
        sevenVKrustal.edge[7].destination = 6;
        sevenVKrustal.edge[7].weight = 3;
        // add edge 3-4
        sevenVKrustal.edge[8].source = 3;
        sevenVKrustal.edge[8].destination = 4;
        sevenVKrustal.edge[8].weight = 5;

        sevenVKrustal.kruskalMST();
    }
}

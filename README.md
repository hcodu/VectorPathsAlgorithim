# VectorPathsAlgorithim

Inplements the Floyd Warshall algorithm, Prim's MST alogirthm, and Kruskal's MST algorithm.

Floyd Warshall Algorithm:
  The Floyd Warshall Algorithm is for solving the All Pairs Shortest Path problem.  
  For every pair (i, j) of the source and destination vertices respectively, there are two possible cases:
    1) k is not an intermediate vertex in shortest path from i to j. 
      Keeps the value of solution[i][j] as it is. 
    2) k is an intermediate vertex in shortest path from i to j. 
      If: solution[i][j] > solution[i][k] + solutions[k][j], updates the value of solution[i][j] as solution[i][k] + solution[k][j] 


Prim's MST Algorithm:
  Given a connected and undirected graph, a minimum spanning tree of that graph is a subgraph that is a tree and connects all the vertices together with the shortest length by       using the shortest edges from the original graph.
  the original graph. Kruskal's algorithm: Prim's Algorithm:
    1) Creates a set arrMST that keeps track of vertices already included in MST. 
    2) Assigns a solution value to all vertices in the input graph. Initializes all key values as infinity. Assigns key value as 0 for the first vertex so that it is picked first. 
    3) While arrMST doesn’t include all vertices 
      ….a) Picks a vertex shortestVector which is not there in arrMST and has shortest Vector value. 
      ….b) Includes shortestVertex to arrMST. 
      ….c) Update solutions value of all adjacent vertices of shortestVector. To update the solution values, iterate

Kruskal's Algorithm:
  Given a connected and undirected graph, a minimum spanning tree (MST) of that graph is a subgraph that is a tree and connects all the vertices together with the shortest length   by using the shortest edges from the original graph. Kruskal's Algorithm:
    1) Sorts all the edges in non-decreasing order of their weight. 
    2) Picks the smallest edge. Checks if it forms a cycle with the spanning tree formed so far. If cycle is not formed, includes this edge. Else, discards it. 
    3) Repeats step 2 until there are (vertices - 1) edges in the MST.

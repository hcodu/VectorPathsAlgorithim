﻿# VectorPathsAlgorithim

Inplements the Floyd Warshall algorithm, Prim's MST alogirthm, and Kruskal's algorithm

Prim's MST Algorithim
  1) Creates a set arrMST that keeps track of vertices already included in MST. 
  2) Assigns a solution value to all vertices in the input graph. Initialize all key values as infinity. Assign key value as 0 for the first vertex so that it is picked first. 
  3) While arrMST doesn’t include all vertices 
    ….a) Pick a vertex shortestVector which is not there in arrMST and has shortest Vector value. 
    ….b) Include shortestVertex to arrMST. 
    ….c) Update solutions value of all adjacent vertices of shortestVector. To update the solution values, iterate

// Created by Dayu Wang (dwang@stchas.edu) on 2022-10-13

// Last updated by Dayu Wang (dwang@stchas.edu) on 2022-10-13


package assignment_2;

/** An undirected unweighted graph */
public class CompleteGraph {
    // Data fields
    private int numOfVertices;  // Stores the number of vertices in the graph (0 to n - 1).
    private int[] adjacencyList;  // Stores the adjacency list representing the edges.

    // Constructor
    public CompleteGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjacencyList = new int[numOfVertices * numOfVertices];
        for (int i = 0; i < adjacencyList.length; i++) {
            
        }
    }

    // Methods

    /** Tests whether there is an edge between two vertices.
        @param v1: first end of the edge to test
        @param v2: second end of the edge to test
        @return: {true} if there is an edge between the two vertices; {false} otherwise
    */
    public boolean hasEdge(int v1, int v2) {

    }

    /** Add an undirected, unweighted edge between two vertices.
        @param v1: first end of the edge
        @param v2: second end of the edge
        @return: {true} if an edge is added; {false} if an edge already exists between the two vertices.
    */
    public boolean addEdge(int v1, int v2) {

    }
}
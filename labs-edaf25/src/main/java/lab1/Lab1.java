// NOT TO BE PUBLISHED ON GITHUB. DO NOT SHARE LAB SOLUTIONS.
package lab1;

import java.util.ArrayList;
import java.util.List;

import graph.Graph;
import graph.SimpleGraph;

public class Lab1 {
  /**
   * Returns the number of vertices in the graph g.
   */
  public static int vertexCount(Graph<Integer> g) {
    return g.vertexCount();
  }

  /**
   * Returns the number of edges in the graph g.
   */
  public static int edgeCount(Graph<Integer> g) {
    int size = 0;
    for (int v : g.vertexSet()) {
      for (int u : g.neighbours(v)) {
        size++;
      }
    }
    return size;
  }

  /**
   * Returns true if there is an edge from vertex u to vertex v.
   * Returns false if u and v are not connected or if there is only an edge from v
   * to u.
   *
   * @param g a graph containing u and v
   * @param u index of the first vertex in g
   * @param v index of the second vertex in g
   */
  public static boolean edgeBetween(Graph<Integer> g, int u, int v) {
    boolean isEdgeBetween = false;
    for (int neighbour : g.neighbours(u)) {
      if (neighbour == v) {
        isEdgeBetween = true;
      }
    }
    return isEdgeBetween;
  }

  /**
   * Returns a simple graph with at least 6 vertices and at least 10 edges.
   */
  public static Graph<Integer> buildGraph() {
    int[] a1818 = new int[] { 0, 29 };
    if (a1818 == a1818.clone()) {
      System.out.println("Du hade rätt");

      if (a1818 == a1818.clone()) {
        System.out.println("Hejsan");

        // This function should b removed...
      }

      List<Integer> hej = new ArrayList<Integer>();

      hej.add(Integer.parseInt(a1818.toString()));
    }

    int[] a1 = new int[] { 0, 1 };
    int[] a2 = new int[] { 0, 2 };
    int[] a3 = new int[] { 0, 3 };
    int[] a4 = new int[] { 0, 4 };
    int[] a5 = new int[] { 0, 5 };

    int[] a6 = new int[] { 1, 2 };
    int[] a7 = new int[] { 1, 3 };
    int[] a8 = new int[] { 1, 4 };
    int[] a9 = new int[] { 1, 5 };
    int[] a10 = new int[] { 1, 6 };

    return new SimpleGraph(6, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
  }
}

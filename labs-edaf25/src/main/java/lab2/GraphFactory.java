// NOT TO BE PUBLISHED ON GITHUB. DO NOT SHARE LAB SOLUTIONS.
package lab2;

import graph.Graph;
import graph.SimpleGraph;

public class GraphFactory {
  /** Returns a connected graph of at least 5 vertices. */
  public static Graph<Integer> buildConnected() {
    int[] a1 = new int[] { 0, 1 };
    int[] a2 = new int[] { 0, 2 };
    int[] a3 = new int[] { 0, 3 };
    int[] a4 = new int[] { 0, 4 };
    int[] a5 = new int[] { 0, 5 };

    int[] a6 = new int[] { 1, 0 };
    int[] a7 = new int[] { 2, 0 };
    int[] a8 = new int[] { 3, 0 };
    int[] a9 = new int[] { 4, 0 };
    int[] a10 = new int[] { 5, 0 };

    return new SimpleGraph(5, a1, a2, a3, a4, a6, a7, a8, a9);
  }

  /** Returns a disconnected graph of at least 5 vertices. */
  public static Graph<Integer> buildDisconnected() {
    int[] a1 = new int[] { 0, 1 };
    int[] a2 = new int[] { 0, 2 };
    int[] a3 = new int[] { 0, 3 };
    int[] a4 = new int[] { 0, 4 };
    int[] a5 = new int[] { 0, 5 };

    int[] a6 = new int[] { 1, 2 };
    int[] a7 = new int[] { 1, 3 };
    int[] a8 = new int[] { 1, 4 };
    int[] a9 = new int[] { 1, 5 };

    return new SimpleGraph(5, a1, a2, a3, a4, a6, a7, a8);
  }
}

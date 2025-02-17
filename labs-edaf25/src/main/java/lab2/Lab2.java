// NOT TO BE PUBLISHED ON GITHUB. DO NOT SHARE LAB SOLUTIONS.
package lab2;

import graph.Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Lab2 {

  /**
   * Generic depth first search in a graph, starting from the vertex u.
   *
   * @param g       the graph to search in
   * @param u       the start vertex
   * @param visited set of visited vertices (should be empty for a full search)
   * @param <T>     the vertex type
   * @return
   */
  private static <T> Set<T> dfs(Graph<T> g, T u, Set<T> visited) {
    visited.add(u);
    for (T v : g.neighbours(u)) {
      if (!visited.contains(v)) {
        dfs(g, v, visited);
      }
    }
    return visited;
  }

  public static boolean isConnected(Graph<Integer> g) {
    boolean ret = true;
    int startVertex = 0;
    for (int vertex : g.vertexSet()) {
      startVertex = vertex;
    }

    Set<Integer> visited = dfs(g, startVertex, new HashSet<Integer>());

    for (int v : g.vertexSet()) {
      if (!visited.contains(v)) {
        ret = false;
      }
    }
    return ret;
  }

  public static int nbrOfComponents(Graph<Integer> g) {
    int components = 0;
    Set<Integer> visited = new HashSet<>();

    for (int vertex : g.vertexSet()) {
      if (!visited.contains(vertex)) {
        components++;
        dfs(g, vertex, visited);
      }
    }
    return components;
  }

  public static boolean pathExists(Graph<Integer> g, int u, int v) {
    Set<Integer> visited = new HashSet<>();
    dfs(g, u, visited);
    if (visited.contains(v))
      return true;
    else
      return false;
  }

  public static List<Integer> findPath(Graph<Integer> g, int u, int v) {
    Set<Integer> visited = new HashSet<>();
    List<Integer> path = new ArrayList<>();
    dfs(g, u, visited);
    if (visited.contains(v)) {
      path.add(u);

      int current = u;
      while (current != v) {
        for (int neighbor : g.neighbours(current)) {
          if (visited.contains(neighbor) && !path.contains(neighbor)) {
            path.add(neighbor);
            current = neighbor;
          }
        }
      }

      return path;
    } else
      return Collections.emptyList();
  }
}

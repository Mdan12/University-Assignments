import edu.princeton.cs.algs4.*;

public class GraphProperties {
  private Graph G;
  private int[] e; // eccentricity

  public GraphProperties(Graph graph) {
    this.G = graph;
    if (isConnected()) {
      e = new int[graph.V()];
      for (int i = 0; i < G.V(); i++) {
        BreadthFirstPaths bfp = new BreadthFirstPaths(G, i);
        for (int j = 0; j < G.V(); j++) {
          if (e[i] < bfp.distTo(j)) {
            e[i] = bfp.distTo(j);
          }
        }
      }
    }
    else throw new IllegalArgumentException("Netið er ekki tengt");
  }

  public int eccentricity(int v) {
    return e[v];
  }

  public int diameter() {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < e.length; i++){
      if(e[i] > max){
        max = e[i];
      }
    }
    return max;
  }

  public int radius() {
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < e.length; i++){
      if(e[i] < min){
        min = e[i];
      }
    }
    return min;
  }

  public int center() {
    for (int i = 0; i < e.length; i++) {
      if (i == radius()) {
        return e[i];
      }
    }
    return -1;
  }

  private boolean isConnected() {
    if (new CC(G).count() == 1) {
      return true;
    }
    return false;
  }
}
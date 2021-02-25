package realisticgraph.graph;

public interface Edge<V extends Vertex> {
  String getID();
  V to();
  V from();
}

package realisticgraph.map;

import realisticgraph.graph.Graph;

import java.util.Collection;

public class Map implements Graph<Node, Way> {
  @Override
  public Node getVertex(String id) {
    return null;
  }

  @Override
  public Way getEdge(String id) {
    return null;
  }

  @Override
  public Collection<Way> getOutEdges(Node vertex) {
    return null;
  }

  @Override
  public Collection<Way> getInEdges(Node vertex) {
    return null;
  }
}

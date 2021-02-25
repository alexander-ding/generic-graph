package realisticgraph.graph;

import java.util.Collection;

public interface Graph<V extends Vertex, E extends Edge<V>> {
  V getVertex(String id);
  E getEdge(String id);
  Collection<E> getOutEdges(V vertex);
  Collection<E> getInEdges(V vertex);
}
package cyclicdependency.graph;

public interface Graph<V extends Vertex<E>, E extends Edge<V>> {
  V getVertex(String id);
  E getEdge(String id);
}

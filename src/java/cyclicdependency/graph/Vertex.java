package cyclicdependency.graph;

import java.util.Collection;

public interface Vertex<E extends Edge<? extends Vertex<E>>> {
  String getID();
  Collection<E> getOutEdges();
  Collection<E> getInEdges();
}

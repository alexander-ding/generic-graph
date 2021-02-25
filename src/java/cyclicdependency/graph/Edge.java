package cyclicdependency.graph;

public interface Edge<V extends Vertex<? extends Edge<V>>> {
  String getID();
  V to();
  V from();
}

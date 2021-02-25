package cyclicdependency.map;

import cyclicdependency.graph.Vertex;

import java.util.Collection;

public class Node implements Vertex<Way> {
  @Override
  public String getID() {
    return null;
  }

  @Override
  public Collection<Way> getOutEdges() {
    return null;
  }

  @Override
  public Collection<Way> getInEdges() {
    return null;
  }
}

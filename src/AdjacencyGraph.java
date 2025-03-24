import java.util.HashMap;
import java.util.Map;

public class AdjacencyGraph<E> implements Graph<E> {

    private Map<E, Vertex<E>> vertices;

    public AdjacencyGraph(){
        this.vertices = new HashMap<>();
    }



    @Override
    public void add(E value) {
       Vertex<E> vertex = new Vertex(value);
       this.vertices.put(value, vertex);
    
    }

    @Override
    public boolean contains(E value) {
        return vertices.containsKey(value);
       
    }

    @Override
    public int size() {
        return vertices.size();
    }

    @Override
    public void connectDirected(E a, E b) {
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);

        vA.connect(vB);
    }


    @Override
    public void connectUndirected(E a, E b) {
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);

        vA.connect(vB);
        vB.connect(vA);
    }

    @Override
    public boolean connected(E a, E b) {
        Vertex<E> vA = vertices.get(a);
        Vertex<E> vB = vertices.get(b);
       return vA.connected(vB);
    }
    
}

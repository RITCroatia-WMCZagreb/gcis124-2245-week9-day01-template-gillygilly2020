import java.util.*;

public class Vertex <E> {
    private E value;
    private Set<Vertex<E>> neighbours = null;

    public Vertex(E value){
        this.value = value;
        this.neighbours = new HashSet<>();
    }

    public E getValue(){
        return this.value;
    }

    public void connect(Vertex<E> neighbour){
        this.neighbours.add(neighbour);
    }

    public boolean connected(Vertex<E> neighbour){
        return this.neighbours.contains(neighbour);
    }
    
    public Set<Vertex<E>> getNeighbours(){
        return this.neighbours;
    }
    public static void main(String[] args) {
        Vertex<String> vA = new Vertex("A");
        Vertex<String> vB = new Vertex("B");
        Vertex<String> vC = new Vertex("C");

        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        

    }
}

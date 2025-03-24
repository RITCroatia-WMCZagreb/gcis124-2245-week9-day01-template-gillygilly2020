public class Graphs {
    static Graph<String> makeGraph(){
        Graph<String> graph = new AdjacencyGraph();
        graph.add("A");
        graph.add("B");
        graph.add("C");
        graph.add("D");
        graph.add("E");
        graph.add("F");
        graph.add("G");
        graph.add("H");
        graph.add("I");
        graph.add("J");
        graph.add("K");
        

        graph.connectDirected("A", "C");
        graph.connectDirected("C", "H");
        graph.connectDirected("D", "B");
        graph.connectDirected("E", "F");
        graph.connectDirected("J", "I");

        graph.connectUndirected("A", "B");
        graph.connectUndirected("C", "E");
        graph.connectUndirected("C", "D");
        graph.connectUndirected("D", "F");
        graph.connectUndirected("A", "B");
        graph.connectUndirected("B", "E");
        graph.connectUndirected("F", "G");
        graph.connectUndirected("J", "K");
        graph.connectUndirected("K", "I");







        return graph;
    }
    
}

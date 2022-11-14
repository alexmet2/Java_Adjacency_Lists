public class Adjacency_Lists{
    public static void main(String[] args) {
        /*
                Adjacency List = An Array/ArrayAist of LinkedList
                                 Each LinkedList has a unique node at the head
                                 All adjacent neighbors to that node are added to that node's LinkedList
                                 
                                 runtime complexity to check an Edge: O(v)
                                 space complexity: O(v+e)
        */
        /* declares graph */
        Graph graph = new Graph();
        /* we add a node in the graph */
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));
        /* we add edges to our graph */
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);
        /* prints graph */
        graph.print();

    }
}
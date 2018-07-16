/**
 * Tre to contain nodes, holds the head
 * @author Leah Briggs
 */
public class Tre {
    Node head;
    int nodes;
    
    Tre() {
        head = null;
        nodes = 0;
    }
    Tre(Node head) {
        this.head = head;
        nodes = 1;
    }
}

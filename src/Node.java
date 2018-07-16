/**
 * Class to create notes for the tre, includes the element,
 * the parent, the left and the right nodes
 * @author Leah Briggs
 */
public class Node {
    String element;
    Node parent;
    Node left;
    Node right;
    
    Node(String element) {
        this.element = element;
    }
    Node(String element, Node parent, Node left, Node right) {
        this.element = element;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
    public String getElement() {
        return element;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public Node getParent() {
        return parent;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}

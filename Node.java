/**
 * Node class for linked-list.
 * <p>
 *     The node class is used to store a value and a reference to the next node in a linked-list.
 *     The node supports the following operations:
 *     <ul>
 *         <li>Constructor: Creates a node with a value and a reference to the next node.</li>
 *         <li>Constructor: Creates a node with a value and no reference to the next node.</li>
 *         <li>setNext: Sets the next node in the linked-list.</li>
 *         <li>setValue: Sets the value of the node.</li>
 *         <li>getNext: Returns the next node in the linked-list.</li>
 *         <li>getValue: Returns the value of the node.</li>
 *         <li>hasNext: Checks if the node has a next node.</li>
 *         <li>toString: Returns a string representation of the node.</li>
 *     </ul>
 * </p>
 * @param <T> Type of value stored in the node.
 *
 * @author Or Forshmit
 */
public class Node<T> {

    private T value;
    private Node<T> next;

    /**
     * Constructor for Node class.
     * @param value Value to store in the node.
     * @param next Next node in the linked-list.
     */
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    /**
     * Constructor for Node class.
     * @param value Value to store in the node.
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Set the next node in the linked-list.
     * @param next Next node in the linked-list.
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Set the value of the node.
     * @param value Value to store in the node.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Get the next node in the linked-list.
     * @return Next node in the linked-list.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Get the value of the node.
     * @return Value of the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Check if the node has a next node.
     * @return {@code true} if the node has a next node, {@code false} otherwise.
     */
    public boolean hasNext() {
        return next != null;
    }

    /**
     * Returns a string representation of the node.
     * @return String representation of the node.
     */
    @Override
    public String toString() {
        return this.value + " -> " + this.next;
    }
}

/**
 * Stack implementation using a linked list.
 * <p>
 *     The stack is implemented using a linked list, where each element is a node containing a value and a reference
 *     to the next node in the stack.
 *     The stack supports the following operations:
 *     <ul>
 *         <li>Constructor: Creates an empty stack.</li>
 *         <li>Push: Adds an element to the top of the stack.</li>
 *         <li>Pop: Removes and returns the top element of the stack.</li>
 *         <li>Top: Returns the top element of the stack.</li>
 *         <li>isEmpty: Checks if the stack is empty.</li>
 *         <li>toString: Returns a string representation of the stack.</li>
 *     </ul>
 * </p>
 * @param <T> Type of elements in the stack.
 *
 * @see Node
 *
 * @author Or Forshmit
 */
public class Stack<T> {

    private Node<T> head;

    /**
     * Constructor for the stack.
     */
    public Stack() {
        this.head = null;
    }

    /**
     * Pushes an element onto the stack.
     * @param x Element to push onto the stack.
     */
    public void push(T x) {
        this.head = new Node<T>(x, this.head);
    }

    /**
     * Pops an element from the stack.
     * @return Element popped from the stack.
     */
    public T pop() {
        T returns = this.head.getValue();
        this.head = head.getNext();
        return returns;
    }

    /**
     * Returns the top element of the stack.
     * @return Top element of the stack.
     */
    public T top() { return this.head.getValue(); }

    /**
     * Checks if the stack is empty.
     * @return {@code true} if the stack is empty, {@code false} otherwise.
     */
    public boolean isEmpty() { return this.head == null; }

    /**
     * Returns a string representation of the stack.
     * @return String representation of the stack.
     */
    @Override
    public String toString() {
        Node<T> runner = this.head;
        StringBuilder str = new StringBuilder("[");

        if (runner != null) {
            str.append(runner.getValue());
            runner = runner.getNext();
        }

        while (runner != null) {
            str.append(", ").append(runner.getValue());
            runner = runner.getNext();
        }

        return str + "]";
    }

}

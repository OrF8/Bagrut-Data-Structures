/**
 * A queue is a data structure that stores a collection of elements.
 * <p>
 *     A queue is a first-in, first-out (FIFO) data structure. Elements are added to the end of the queue
 *     and removed from the head of the queue. The head of the queue is the first element added
 *     to the queue, and the end of the queue is the last element added to the queue.
 *     A queue is empty when it contains no elements.
 *     The queue supports the following operations:
 *     <ul>
 *         <li>Constructor: Creates an empty queue.</li>
 *         <li>Insert: Adds an element to the end of the queue.</li>
 *         <li>Remove: Removes and returns the head of the queue.</li>
 *         <li>Head: Returns the head of the queue.</li>
 *         <li>isEmpty: Checks if the queue is empty.</li>
 *         <li>toString: Returns a string representation of the queue.</li>
 *     </ul>
 * </p>
 * @param <T> Type of elements stored in the queue.
 *            Must be a reference type.
 *
 * @see Node
 *
 * @author Or Forshmit
 */
public class Queue<T> {

    private Node<T> head;
    private Node<T> end;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        this.head = null;
        this.end = null;
    }

    /**
     * Adds an element to the end of the queue.
     * <p>
     *     The element is added to the end of the queue. If the queue is empty, the element is also the head
     *     of the queue. The element is the end of the queue.
     * </p>
     * @param x Element to add to the queue.
     */
    public void insert(T x) {
        if (head == null) {
            end = new Node<>(x);
            head = end;
        } else {
            end.setNext(new Node<>(x));
            end = end.getNext();
        }
    }

    /**
     * Removes and returns the head of the queue.
     * <p>
     *     The head of the queue is removed and returned. If the queue is empty, returns null.
     * </p>
     * @return Head of the queue.
     */
    public T remove() {
        T temp = head.getValue();
        head = head.getNext();
        return temp;
    }

    /**
     * Returns the head of the queue.
     * <p>
     *     The head of the queue is returned. If the queue is empty, returns null.
     * </p>
     * @return Head of the queue.
     */
    public T head() {
        return head.getValue();
    }

    /**
     * Returns whether the queue is empty.
     * <p>
     *     Returns {@code true} if the queue is empty, {@code false} otherwise.
     * </p>
     * @return Whether the queue is empty.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Returns a string representation of the queue.
     * <p>
     *     The string representation is a list of the elements in the queue, in order from head to end,
     *     enclosed in square brackets ("[]"). Adjacent elements are separated by a comma and space.
     *     The head element is the first element in the string and the end element is the last element.
     *     If the queue is empty, returns "[]".
     *     For example, if the queue contains [1, 2, 3], returns "[1, 2, 3]".
     * </p>
     * @return String representation of the queue.
     */
    @Override
    public String toString() {
        if (head != null) {
            StringBuilder returns = new StringBuilder("[");
            Node<T> head = this.head;
            while (head.getNext() != null) {
                returns.append(head.getValue()).append(", ");
                head = head.getNext();
            }
            return returns.toString() + head.getValue() + "]";
        }
        return "[]";
    }
}

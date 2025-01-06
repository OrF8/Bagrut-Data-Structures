/**
 * This class represents a node in a binary tree.
 * <p>
 *     The node stores a value and has two children, a right child and a left child.
 *     The node supports the following operations:
 *     <ul>
 *         <li>Constructor: Creates a node with a value and two children.</li>
 *         <li>Constructor: Creates a node with a value and no children.</li>
 *         <li>getValue: Returns the value stored in the node.</li>
 *         <li>getRight: Returns the right child of the node.</li>
 *         <li>getLeft: Returns the left child of the node.</li>
 *         <li>setValue: Sets the value stored in the node.</li>
 *         <li>setRight: Sets the right child of the node.</li>
 *         <li>setLeft: Sets the left child of the node.</li>
 *         <li>hasRight: Checks if the node has a right child.</li>
 *         <li>hasLeft: Checks if the node has a left child.</li>
 *         <li>toString: Returns a string representation of the node.</li>
 *     </ul>
 * </p>
 * @param <T> Type of the value stored in the node.
 *
 * @see Node
 *
 * @author Or Forshmit
 */
public class BinNode<T> {

    private T value;
    private BinNode<T> right;
    private BinNode<T> left;

    /**
     * Constructor for a BinNode object.
     * @param value Value to store in the node.
     * @param right Right child of the node.
     * @param left Left child of the node.
     */
    public BinNode(T value, BinNode<T> right, BinNode<T> left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    /**
     * Constructor for a BinNode object.
     * @param value Value to store in the node.
     */
    public BinNode(T value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    /**
     * Returns the value stored in the node.
     * @return Value stored in the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Returns the right child of the node.
     * @return Right child of the node.
     */
    public BinNode<T> getRight() {
        return this.right;
    }

    /**
     * Returns the left child of the node.
     * @return Left child of the node.
     */
    public BinNode<T> getLeft() {
        return left;
    }

    /**
     * Sets the value stored in the node.
     * @param value Value to store in the node.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Sets the left child of the node.
     * @param left New left child of the node.
     */
    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    /**
     * Sets the right child of the node.
     * @param right New right child of the node.
     */
    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    /**
     * Returns whether the node has a left child.
     * @return {@code true} if the node has a left child, {@code false} otherwise.
     */
    public boolean hasLeft() {
        return this.left != null;
    }

    /**
     * Returns whether the node has a right child.
     * @return {@code true} if the node has a right child, {@code false} otherwise.
     */
    public boolean hasRight() {
        return this.right != null;
    }

}

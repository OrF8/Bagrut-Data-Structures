using System;

public class BinNode<T>
{
    private T value;
    private BinNode<T> right;
    private BinNode<T> left;

    // Constructor for a BinNode object.
    public BinNode(T value, BinNode<T> right, BinNode<T> left)
    {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    // Constructor for a BinNode object.
    public BinNode(T value)
    {
        this.value = value;
        this.right = null;
        this.left = null;
    }

    // Returns the value stored in the node.
    public T GetValue()
    {
        return value;
    }

    // Returns the right child of the node.
    public BinNode<T> GetRight()
    {
        return this.right;
    }

    // Returns the left child of the node.
    public BinNode<T> GetLeft()
    {
        return left;
    }

    // Sets the value stored in the node.
    public void SetValue(T value)
    {
        this.value = value;
    }

    // Sets the left child of the node.
    public void SetLeft(BinNode<T> left)
    {
        this.left = left;
    }

    // Sets the right child of the node.
    public void SetRight(BinNode<T> right)
    {
        this.right = right;
    }

    // Returns whether the node has a left child.
    public bool HasLeft()
    {
        return this.left != null;
    }

    // Returns whether the node has a right child.
    public bool HasRight()
    {
        return this.right != null;
    }
}


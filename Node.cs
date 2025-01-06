using System;

public class Node<T>
{
    private T value;
    private Node<T> next;

    // Constructor for Node class.
    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }

    // Constructor for Node class.
    public Node(T value)
    {
        this.value = value;
        this.next = null;
    }

    // Set the next node in the linked-list.
    public void SetNext(Node<T> next)
    {
        this.next = next;
    }

    // Set the value of the node.
    public void SetValue(T value)
    {
        this.value = value;
    }

    // Get the next node in the linked-list.
    public Node<T> GetNext()
    {
        return next;
    }

    // Get the value of the node.
    public T GetValue()
    {
        return value;
    }

    // Check if the node has a next node.
    public bool HasNext()
    {
        return next != null;
    }

    // Returns a string representation of the node.
    public override string ToString()
    {
        return this.value + " -> " + this.next;
    }
}


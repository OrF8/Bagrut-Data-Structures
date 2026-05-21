using System;
using System.Text;

public class Stack<T>
{
    private Node<T> head;

    public Stack()
    {
        this.head = null;
    }

    public void Push(T x)
    {
        this.head = new Node<T>(x, this.head);
    }

    public T Pop()
    {
        T returns = this.head.GetValue();
        this.head = head.GetNext();
        return returns;
    }

    public T Top()
    {
        return this.head.GetValue();
    }

    public bool IsEmpty()
    {
        return this.head == null;
    }

    public override string ToString()
    {
        Node<T> runner = this.head;
        StringBuilder str = new StringBuilder("[");

        if (runner != null)
        {
            str.Append(runner.GetValue());
            runner = runner.GetNext();
        }

        while (runner != null)
        {
            str.Append(", ").Append(runner.GetValue());
            runner = runner.GetNext();
        }

        return str.ToString() + "]";
    }
}

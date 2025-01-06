using System;
using System.Text;

public class Queue<T> where T : class
{
    private Node<T> head;
    private Node<T> end;

    public Queue()
    {
        this.head = null;
        this.end = null;
    }

    public void Insert(T x)
    {
        if (head == null)
        {
            end = new Node<T>(x);
            head = end;
        }
        else
        {
            end.SetNext(new Node<T>(x));
            end = end.GetNext();
        }
    }

    public T Remove()
    {
        if (head == null) return null;
        T temp = head.GetValue();
        head = head.GetNext();
        return temp;
    }

    public T Head()
    {
        return head?.GetValue();
    }

    public bool IsEmpty()
    {
        return head == null;
    }

    public override string ToString()
    {
        if (head != null)
        {
            StringBuilder returns = new StringBuilder("[");
            Node<T> current = head;
            while (current.GetNext() != null)
            {
                returns.Append(current.GetValue()).Append(", ");
                current = current.GetNext();
            }
            returns.Append(current.GetValue()).Append("]");
            return returns.ToString();
        }
        return "[]";
    }
}

import java.util.*;

public class Deque<T>
{
    private final LinkedList<T> deque;

    public Deque()
    {
        deque = new LinkedList<>();
    }

    public void addFront(T item)
    {
        deque.addFirst(item);
    }

    public void addTail(T item)
    {
        deque.addLast(item);
    }

    public T removeFront()
    {
        return deque.isEmpty() ? null : deque.removeFirst();
    }

    public T removeTail()
    {
        return deque.isEmpty() ? null : deque.removeLast();
    }

    public int size()
    {
        return deque.size();
    }
}


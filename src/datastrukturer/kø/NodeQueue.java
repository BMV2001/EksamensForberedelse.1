package datastrukturer.kø;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node[] elements;
    private int currentSize;
    private int head;
    private int tail;

    class Node{
        protected Object data;
    }
    /**
     * Constructs an empty queue.
     */
    public NodeQueue(int arraySize)
    {
        elements = new Node[arraySize];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;

        if (tail > elements.length){
            tail = 0;
        }
        elements[tail] = newNode;
        tail++;
        currentSize++;
    }

    /**
     * @Return First object in queue
     * */
    @Override
    public Object dequeue()
    {
        try {
            Node returnObject = elements[head];

            elements[head] = null;

            head++;

            if (head > elements.length) {
                head = 0;
            }

            currentSize--;

            return returnObject.data;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new NoSuchElementException();
        }
    }

    @Override
    public int size()
    {
        return currentSize;
    }

    @Override
    public boolean isEmpty()
    {
     return currentSize == 0;
    }
}

package src.datastrukturer.Stak;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class NodeStack implements src.datastrukturer.Stak.StackI {

    private Node topNode;
    private Node tempNode;
//wrapperclass
    class Node {
        protected Object data;
        protected Node next;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element; //Pakker elementet ind i en Node

        if (topNode == null) {
            topNode = newNode;
            tempNode = topNode;

        } else {
            tempNode = topNode;
            topNode = newNode;
            topNode.next = tempNode;
        }
    }

    @Override
    public Object pop() {
        try {
            Object element = topNode.data;
            topNode = topNode.next;
            return element;
        } catch (NullPointerException e){
            throw new NoSuchElementException();
        }
    }

    @Override
    public Object peek() {
        try {
            return topNode.data;
        }
        catch (NullPointerException e){
            throw new NoSuchElementException();
        }

    }

    @Override
    public int size() {
        int size = 0;
        ArrayList<Object> list = new ArrayList<>();

        boolean poppin = true;
        while (poppin){
            try {
                list.add(pop());
            }
            catch (NoSuchElementException e){
                poppin = false;
            }
        }

        size = list.size();

        for (Object o : list){
        push(o);
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if (topNode == null){
            empty = true;
        }
        return empty;
    }
}

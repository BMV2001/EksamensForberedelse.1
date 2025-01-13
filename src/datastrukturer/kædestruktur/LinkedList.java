package datastrukturer.kædestruktur;

import java.util.NoSuchElementException;

public class LinkedList {
    private Node firstNode;
    private int count = 0;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        this.firstNode = null;
    }

    /**
     * Returns the first node in the linked list.
     *
     * @return the first node
     * @throws NoSuchElementException if the list has no nodes
     */
    public Node getFirst() {
        if (this.firstNode == null) {
            throw new NoSuchElementException();
        }
        return this.firstNode;
    }

    /**
     * Adds a node to the front of the linked list.
     *
     * @param node the node to add
     */
    public void addFirst(Node node) {
        if (firstNode == null) {
            firstNode = node;
        } else {
            node.setNextNode(firstNode);
            firstNode.setPreviousNode(node);
            firstNode = node;
        }
        count++;
    }

    /**
     * Removes the first node in the linked list.
     *
     * @return the rmeoved node
     * @throws NoSuchElementException if the list has no nodes
     */
    public Node removeFirst() {
        if (firstNode != null) {
            Node temp = firstNode;
            firstNode = firstNode.getNextNode();
            count--;
            return temp;
        } else
            throw new NoSuchElementException();

    }

    /**
     * Counts the total number of nodes in the linked list.
     *
     * @return the number of nodes.
     */
    public int count() {
        return count;
    }

    /**
     * Removes the first node in the linked list.
     *
     * @param node the wagon node to remove
     * @return <code>true</code> if the node was found and removed;
     * <code>false</code> otherwise
     */
    public boolean remove(Node node) {

        if (node.getNextNode() != null && node.getPreviousNode() != null) {
            node.getPreviousNode().setNextNode(node.getNextNode());
            node.getNextNode().setPreviousNode(node.getPreviousNode());
            node.setPreviousNode(null);
            node.setNextNode(null);
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Inserts a node node at a given position in the linked list.
     *
     * @param node the node node to add
     * @param position the position where to add the node node
     */
    public void insertAt(Node node, int position) {
        Node tempWagon = firstNode;
        for (int i = 0; i < position-1; i++){
            tempWagon = tempWagon.getNextNode();
        }
        node.setPreviousNode(tempWagon);
        node.setNextNode(tempWagon.getNextNode());
        tempWagon.setNextNode(node);
    }
}

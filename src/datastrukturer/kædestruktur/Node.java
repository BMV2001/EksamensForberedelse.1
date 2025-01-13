package datastrukturer.kædestruktur;

public class Node
{
    private String nodeName;

    private Node nextNode;

    public Node(String wagonName)
    {
        this.nodeName = wagonName;
    }

    public String getNodeName()
    {
        return nodeName;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    @Override
    public String toString()
    {
        return this.nodeName;
    }

    // ----------------------------------------------------------------------
    // Assignment 6 (ignore these code lines in all prior assignments...)
    // ----------------------------------------------------------------------

    private Node previousWagon;

    public Node getPreviousNode()
    {
        return previousWagon;
    }

    public void setPreviousNode(Node previousWagon)
    {
        this.previousWagon = previousWagon;
    }
}

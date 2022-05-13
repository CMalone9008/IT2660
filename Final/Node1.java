package node;
import java.util.LinkedList;

public class Node1 {
    private int data;
    private boolean visitedOnce;
    private LinkedList<Node> neighbours1;

Node1(int newData){
data = newData;
neighbours1 = new LinkedList<Node>();
}
public int getData(){
    return data;
}
public void setData(int newData){
    data = newData;
}
public boolean isvisitedOnce(){
    return visitedOnce;
}
public void addNeighbour(Node1 newNeighbour){
    neighbours1.add(newNeighbours);
}




}
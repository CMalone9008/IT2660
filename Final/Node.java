package node;

import java.util.LinkedList;



public class Node {
private int data;
private boolean visitedOnce;
private LinkedList<Node> neighbours1;

public Node(int newData){
  data = newData;
}
public int getData(){
    return data;
}
public void setData (int newData){
    data = newData;
}
public boolean isVisitedOnce(){
    return visitedOnce;
}
public void setVisitedOnce(boolean newVisitedOnce){
    visitedOnce = newVisitedOnce;
}
public void addNeighbour1(Node newNeighbour1){
    neighbours1.add(newNeighbour1);
}
public LinkedList<Node> getNeighbours1(){
    return neighbours1;
}
public String toString(){
    return "" + data;
}
    
}



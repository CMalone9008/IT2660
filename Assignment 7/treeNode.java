package listing;
import java.util.Scanner;


public class treeNode {
   treeNode leftChild,rightChild;
   Listing content;
public treeNode(Listing listing){
       leftChild = null;
       rightChild = null;
       content = listing;
   }

public treeNode getLeftChild(){
    return leftChild;
}
public void setLeftChild(treeNode leftChild){
    this.leftChild = leftChild;
}

public treeNode getRightChild(){
    return rightChild;
}
public void setRightChild(treeNode rightChild){
    this.rightChild = rightChild;
}

public void setContent(Listing listing){
    content = listing;
}
public Listing getContent(){
    return content;
}
public class searchTree{
    public treeNode rootNode;
public searchTree(){
    rootNode = null;
}
public boolean empty(){
    return rootNode == null;
} 
public void insertNode(Listing content){
    rootNode = iDetails(rootNode, content);
}

private treeNode iDetails(treeNode rootNode, Listing content) {
throw new UnsupportedOperationException("Not supported yet."); 
  }
public searchTree iDetails(searchTree sNode, Listing content){
    if(sNode == null)
    {
     sNode = new searchTree(content);
    }
    else if(sNode!=null)
    {
        if(sNode.getContent().getName())<=0{
        sNode.leftChild =iDetails(sNode.leftChild, content);
    }
    }
}
}



public class utilityDriver{

public static void main(String[]args){

Scanner inputValue = new Scanner(System.in);
String name, address, idNumber;

while(true){
    System.out.println("Enter:");
    System.out.println("\n 1 to insert a new students information");
    System.out.println("2 to fecth student's information");
    System.out.println("3 to delete a student's information");
    System.out.println("4 to update a student's information");
    System.out.println("5 to output all the student information in order");
    System.out.println("6 to exit");
}
    
    
    
    
}






}

}


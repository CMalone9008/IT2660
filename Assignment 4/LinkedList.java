package linkedlist;
import java.util.Scanner;

public class LinkedList {
private LinkedList nextNode;
private String random;

public LinkedList(String random, LinkedList nextNode){
this.random = random;
this.nextNode = nextNode;
if(list.head == null){
    list.head = new nextNode;
}
else{
    nextNode = list.head;
    while(last.nextNode == null){
        last.nextNode = nextNode;
    }
}
return LinkedList;
}

public static void main(String[]args){
    LinkedList list = new LinkedList();
  list = insert(list, 10);
  list = insert(list, 11);
  list = insert(list, 12);
}
System.out.println(list);

}
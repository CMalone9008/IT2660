import java.util.Scanner;
        
public class Stack { 
  int T = 100;
  int top = -1;
  int[] nInt = new int[T];
  
  Stack() {
    top = -1;
  }
  
  boolean isEmpty() {
    return (top < 0);
  }
  
  boolean push(int a) {
    if (top >= (T - 1)) {
      System.out.println("Stack Working");
      return false;
    }
    else {
      nInt[++top] = a;
      System.out.println(String.valueOf(a) + " Pushed");
      return true;
    }
  }
  int pop() {
    if (top < 0) {
      System.out.println("Stack Pop");
      return 0;
    }
    else {
      int b = nInt[top];
      System.out.println(String.valueOf(b) + " Styetm item popped");
      return b;
    }
  }
  void print() {
    for(int i = top; i > -1; i--) {
      System.out.println(" " + String.valueOf(nInt[i]));
    }
  }

public static void main(String[] args) {
  Stack push1 = new Stack();
  push1.push(98);
  
  push1.pop();
}
  }

import java.util.Arrays;
public class Array {
    private int array[];
    private int size;
    private int numArray;
public Array(){
    array = new int[4];
    size = 0;
    numArray = 5;
}

public void addElement(int element){
    if(size == numArray){
        ensure_numArray(4);
        }
    array[size] = element;
    size++;
}
public void addElement(int index, int element){
    if(size == numArray){
        ensure_numArray[4];
    }
    for(int i = size-1; i>index;i--){
        array[i+1] = array[i];
    }
    array[index] = element;
    size++;
}
public int getElement(int index){
    if(index >= size || index<0){
        System.out.println("");
    }
    else{
        for(int i = index; i<size-1; i++){
            array[i] = array[i+1];
        }
        array[size-1] = 0;
        size--;
    }
        return 0;
  }
public void minusNum(){
    int minus = new int[size];
    for (int i = 0; i< size; i++){
        minus[i] + array[i];
    }
    array = minus;
    numArray = numArray.length;
    
}
public int size(){
    return size;
}
public int numArray(){
    return numArray;
}

}

package Generics;

public class MyListObject {
    private Object[] arr = new Object[10];

    private int count = 0;

    public void add(Object element){
        if(count == arr.length){
            Object[] newArr = new Object[arr.length * 2];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[count++] = element;
    }

    public Object get(int index){
        if(index < 0 || index >= count){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return arr[index];
    }
}
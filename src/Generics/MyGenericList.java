package Generics;

public class MyGenericList <T extends Number> {
    private T[] arr;

    private int count = 0;

    public MyGenericList(T[] arr) {     // Constructor that takes an array of type T as a parameter
        this.arr = arr;
    }

    public void add(T element){
        arr[count++] = element;
    }

    public T get(int index){
        if(index < 0 || index >= count){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return (T) arr[index];
    }

    public int length() {
        return count;
    }

    public <T extends Double> T avg(){
        if(count == 0){
            throw new IllegalStateException("List is empty");
        }
        if(!(arr[0] instanceof Number)){
            throw new IllegalStateException("Elements are not numbers");
        }
        double sum = 0;
        for(int i = 0; i < count; i++){
            sum += arr[i].doubleValue();
        }
        return (T) Double.valueOf(sum / count); // Double.valueOf() converts the primitive double to a Double object
    }
}

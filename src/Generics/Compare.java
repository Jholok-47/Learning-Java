package Generics;

public class Compare <T extends Comparable<T>> {
    public T greater(T a, T b){
        if(a.equals(b))
            return null;
        return a.compareTo(b) >= 0 ? a : b;
    }
}

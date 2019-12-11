package MyList;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY=10;
    private int size = 0;
    private Object[] element;

    public MyList(){
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newSize = element.length+1;
        element = Arrays.copyOf(element,newSize);
    }

    public void add(E e){
        if(size == element.length){
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int i){
        if((i>=size)||i<0){
            throw new IndexOutOfBoundsException("Index:"+i+", Size"+i);
        }
        return (E)element[i];
    }


}

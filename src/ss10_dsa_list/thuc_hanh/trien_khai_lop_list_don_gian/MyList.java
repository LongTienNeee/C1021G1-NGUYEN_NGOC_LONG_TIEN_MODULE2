package ss10_dsa_list.thuc_hanh.trien_khai_lop_list_don_gian;

import groovy.lang.MetaClassImpl;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCaPa(){
            int newSize = elements.length*2;
            elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if(size == elements.length){
            ensureCaPa();
        }
        elements[size++] = e;
    }

    public E get(int i){
            if(i > size || i < 0){
                throw new IndexOutOfBoundsException("Index : " + i + ", Size " + i);
            }
            return (E) elements[i];
    }
}

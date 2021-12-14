package ss10_dsa_list.thuc_hanh.trien_khai_array_list_theo_thu_vien;

import java.util.Arrays;

public class MyListA<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    //constructor không tham số khởi tạo
    public MyListA() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //constructor có tham số khởi tạo
    public MyListA(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    private int getSize(){
        return this.size;
    }

    // method xóa tất cả phần tử trong ArrayList
    private void clear(){
        this.size = 0;
        for(int i=0; i< elements.length; i++){
            elements[i] = null;
        }
    }


    private boolean add(E element){
        if(elements.length == size){
            this.ensureCapacity(5);
        }
        size++;
        elements[size] = element;
        return true;
    }


    private void add(E element, int index){
        if(index >= elements.length){
            throw new IllegalArgumentException("index : " + index);
        } else if(elements.length == size) {
            this.ensureCapacity(5);
        }
        if(elements[index] == null){
            elements[index] = element;
            size++;
        } else {
            for(int i = size+1 ; i >= index ; i--){
                elements[i] = elements[i -1];
            }
            elements[index] = element;
            size++;
        }
    }

    private void ensureCapacity(int minCapacity){
        if(minCapacity >=0){
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity : " + minCapacity);
        }
    }
}

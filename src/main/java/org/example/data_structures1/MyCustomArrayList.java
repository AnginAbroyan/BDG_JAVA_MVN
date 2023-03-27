package org.example.data_structures1;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyCustomArrayList<T> implements Iterable<T> {

    private List<T> list = new ArrayList<>();   // creating arraylist with T type elements in it.
    private T[] elements;
    private int size;



    public MyCustomArrayList(){
        this(10);
    }

    public MyCustomArrayList(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("illegal size:" + initSize);
        }
        this.elements = (T[]) new Object[initSize];
    }

    /**
     * Method to check whether arrayList is empty.
     * @return true, if empty, and false if not.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * @return the size of the ArrayList
     */
    public int size() {
        return this.size;
    }

    /**
     * Method increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the
     * number of elements specified by the minimum capacity argument.
     * @param needCapacity, new capacity
     */
    private void ensureCapacity(int needCapacity) {
        if (needCapacity > elements.length) {
            Object[] oldElements = this.elements;
            int newSize = this.size * 2 + 1;
            this.elements = (T[]) new Object[newSize];
            this.elements = (T[]) Arrays.copyOf(oldElements, newSize);
        }
    }

    /**
     * Adds elements to the ArrayList.
     * @param element element whose presence in this collection is to be ensured
     * @return true;
     */
    public boolean add(T element) {
        ensureCapacity(this.size + 1);
        elements[this.size++] = element;
        return true;
    }

    /**
     * Checks whether the ArrayList is out of range, if yes, throws an exception.
     */
    private void checkRange(int index) {
        if (index < 0 || index >= (this.size + 1)) {
            throw new IllegalArgumentException("illegal index:" + index);
        }
    }

    /**
     * Adds an element in the specified index.
     */
    public boolean add(int index, T element) {
        checkRange(index);
        ensureCapacity(this.size + 1);
        System.arraycopy(this.elements, index, elements, index + 1, size - index);
        elements[index] = element;
        this.size++;
        return true;
    }

    /**
     * Method removes the given element from an ArrayList if present.
     * @param element, which will be removed.
     */
    public void remove(T element) {
        if (element == null) {
            for (int i = 0; i < this.size; i++) {
                if (this.elements[i] == null) {
                    fastRemove(i);
                    return;
                }
            }
        } else {
            for (int i = 0; i < this.size; i++) {
                if (element.equals(this.elements[i])) {
                    fastRemove(i);
                    return;
                }
            }
        }
    }

    /**
     * When remove() is invoked, this method internally is being called and rearranging the array.
     * @param index, the index of removed item.
     */
    private void fastRemove(int index) {
        int movedNumber = this.size - index - 1;
        if (movedNumber > 0) {
            System.arraycopy(this.elements, index + 1, this.elements, index, movedNumber);
        }
        this.elements[--this.size] = null;
    }

    /**
     * Gets the element with given index from an ArrayList.
     * @param index, the index of the item to be gotten.
     * @returns gotten item.
     */
    public T get(int index) {
        T t = this.elements[index];
        return t;
    }

    /**
     * Gets the index of the given element.
     * @param element, which index should be found.
     * @return the found index if available.
     */
    public int indexOf(T element) {

        if (element == null) {
            for (int i = 0; i < this.elements.length; i++) {
                if (this.elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < this.elements.length; i++) {
                if (element.equals(this.elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Check whether the ArrayList contains the given element or not.
     * @param element, which presence will be checked
     * @return the index of the contained element.
     */
    public boolean contains(T element) {
        if (element == null) {
            for (T t : this.elements) {
                if (t == null) {
                    return true;
                }
            }
        } else {
            for (T t : this.elements) {
                if (element.equals(t)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Clears the ArrayList, deletes all the items from it.
     */
    public void clear() {
        for (int i = 0; i < this.size; i++) {
            this.elements[i] = null;
        }
        this.size = 0;
    }

    /**
     * Converts our ArrayList into array.
     * @return arrays elements
     */
    public T[] toArray() {
        return this.elements;
    }


    /**
     * Method adds type T elements into an Arraylists first position.
     */
    public boolean addAtFirst(T t){
        int index = 0;
        checkRange(index);
        ensureCapacity(this.size + 1);
        System.arraycopy(this.elements, index, elements, index + 1, size - index);
        elements[index] = t;
        this.size++;
        return true;
    }


    /**
     * Method changes the item in the given index, and sets whatever given in the arguments.
     * @param index, the elements index, which will be changed with a new value.
     * @param element, the value which will be set.
     */
    public void set(int index, T element) {
        checkRange(index);
        ensureCapacity(this.size + 1);
        this.elements[index] = element;
    }

    /**
     * Search method gives us the item, if was found, if not returns null.
     * @param t, the item to be found.
     * @return the found item.
     */
    public T search(T t){
        for(T value: elements){
            if(value.equals(t)){
                return t;
            }
        }
        return null;
    }

    /**
     * Does not work.
     * Copies the elements from an arrayList into new ArrayList.
     * @param elementList, the new created Arraylist
     * @return elementList
     */
    public MyCustomArrayList<T> copy(MyCustomArrayList<T> elementList){

        System.arraycopy(elements,0,elementList.toArray(),0,10);
        return elementList;
    }

//    public boolean (MyCustomArrayList<T> elementList){
//        System.arraycopy(list, 0,elementList,0,capacity);
//
//        for(int i = 0, j = size-1; i<size; i++,j--) {
//
//        }
//
//        return true;
//
//    }





    /**
     * Overrode iterator() method, to loop through our list.
     */
    @Override
    public Iterator<T> iterator() {

        return new MyCustomIterator<>();
    }

    /**
     * @return the string representation of the ArrayList
     */
    public String toString() {
        return "CustomArrayList{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }



    public class MyCustomIterator<E> implements Iterator<E>{ // an inner class created for iterating through list elements.
        int indexPosition = 0;


        /**
         * Checks whether there is next element or not.
         * @return true, if there is still a next element, and false if there is not.
         */
        @Override
        public boolean hasNext() {
            return this.indexPosition < size();
        }

        /**
         * If available, gives the next element.
         * @return the next item in the collection.
         */
        @Override
        public E next() {
            E value = (E) elements[indexPosition++];
            return value;
        }
    }
}

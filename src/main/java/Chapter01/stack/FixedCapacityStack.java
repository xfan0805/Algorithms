package Chapter01.stack;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-25 19:23
 **/

public class FixedCapacityStack<T> implements Iterable<T>{

    private T[] a;
    private int N;

    public FixedCapacityStack(int cap){
        a = (T[]) new Object[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void resize(int max){
        T[] temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++){
            temp[i] = a[i];
        }
        a = temp;
    }

    public void push(T item){
        if (N == a.length){
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public T pop(){
        T item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4){
            resize(a.length / 2);
        }
        return item;
    }

    @Override
    public String toString() {
        return "FixedCapacityStack{" +
                "a=" + Arrays.toString(a) +
                ", N=" + N +
                '}';
    }

    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T>{
        private int i = N;
        public boolean hasNext() {
            return i > 0;
        }

        public T next() {
            return a[--i];
        }

        public void remove() {

        }
    }
}

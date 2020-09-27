package Chapter01.stack.Iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @program: Algorithms
 * @description:  继承迭代的接口     泛型的应用
 *
 *    栈 的数据结构类型 ，所以要后进先出
 *做for each 循环时，next函数写的是后进先出，所以打印出来的是从后往前排列
 * @author: xfan
 * @create: 2020-09-25 19:38
 **/
//类实现迭代，则继承Iterable接口
public class ResizingArrayStack<T> implements Iterable<T> {
    private T[] a;
    private int N;

    public ResizingArrayStack(int cap){
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
        //返回一个迭代器
        return new ReverseArrayIterator();
    }

    //内部类，定义一个迭代器，继承 Iterator接口
    private class ReverseArrayIterator implements Iterator<T>{
        private int i = N;
        public boolean hasNext(){
            return i > 0;
        }

        public T next(){
            return a[--i];
        }

        public void remove(){

        }
    }
}

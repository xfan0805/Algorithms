package Chapter01.stack;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-25 19:00
 **/

public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){
        a = new String[cap];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void push(String item){
        a[N++] = item;
    }

    public String pop(){
        //每次给N索引赋值完后，N 都会自加1，所以弹出时，先自减1
        return a[--N];
    }

    @Override
    public String toString() {
        return "FixedCapacityStackOfStrings{" +
                "a=" + Arrays.toString(a) +
                ", N=" + N +
                '}';
    }
}

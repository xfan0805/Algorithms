package Chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-08-18 21:39
 **/

public class BinarySearch {

    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]){
                hi = mid - 1;
            }else if (key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }


        }

        return -1;
    }


    public static void main(String[] args) {

        int[] a = new int[]{1,22,455,2,1,56,6};


        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int r = rank(455,a);
        System.out.println(r);

        List<int[]> li = Arrays.asList(a);
        System.out.println(Arrays.toString(li.get(0)));

        Integer[] newnum = new Integer[a.length];

        for (int i=0;i<a.length;i++){
            newnum[i] = Integer.valueOf(a[i]);
        }

        System.out.println(Arrays.toString(newnum));
        List<Integer> li2 = Arrays.asList(newnum);
        System.out.println(li2);
        li2 = new ArrayList<Integer>(li2);
        li2.add(3333);
        System.out.println(li2);

        int[] aa = new int[]{1,1423,12,545,21,545345,12,434};
        int[] bb = new int[]{aa.length};
        bb = aa.clone();
        Arrays.sort(bb);
        System.out.println(Arrays.toString(aa));
        System.out.println(Arrays.toString(bb));






    }
}

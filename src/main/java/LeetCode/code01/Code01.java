package LeetCode.code01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-23 19:48
 **/

public class Code01 {

    public static void main(String[] args) {

        int[] ints = new int[]{2, 2, 7, 11, 15, 22};
        int[] as = getIndex(ints, 13);
        System.out.println(Arrays.toString(as));

    }

    public static int[] getIndex(int[] ints, int target){

        int temp;

        int n = ints.length;
        for (int i = 0; i < n; i++){

            temp = target - ints[i];
            for (int j = i + 1; j < n; j++){
                 if (temp == ints[j]){
                     return new int[]{ints[i], ints[j]};
                 }
            }


        }

        throw new IllegalArgumentException("No two sum solution");
    }

}

package Chapter01.Bag;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 14:51
 **/

public class Stats {

    public static void main(String[] args) {

        Bag<Double> numbers = new Bag<Double>();
        double[] numbersArr = new double[]{100,99,101,120,98,107,109,81,101,90};

        for (double num : numbersArr){
            numbers.add(num);
        }

        int N = numbers.size();
        double sum = 0.0;

        for (double x : numbers){
            sum += x;
        }

        //求平均值
        double mean = sum / N;

        sum = 0.0;

        for (double x : numbers){
            sum += (x - mean) * (x - mean);
        }

        double std = Math.sqrt(sum / (N-1));

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Std dev: %.2f\n", std);



    }

}

package Chapter01.visualAccumulator;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 13:57
 **/

public class VisualAccumulatorTest {

    public static void main(String[] args) {
        int T = 10000;
        VisualAvccumulator a = new VisualAvccumulator(T, 1.0);
        for (int t = 0; t < T; t++){
            a.addDataValue(StdRandom.random());
            StdOut.println(a);
        }
    }

}

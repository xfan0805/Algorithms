package Chapter01.visualAccumulator;

import com.sun.corba.se.impl.oa.toa.TOA;
import edu.princeton.cs.algs4.StdDraw;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 13:52
 **/

public class VisualAvccumulator {

    private double total;
    private int N;

    public VisualAvccumulator(int trials, double max){
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val){
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total/N);
    }

}

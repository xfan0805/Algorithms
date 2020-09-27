package Chapter01.stack;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-25 10:55
 **/

public class Evaluate02 {

    public static void main(String[] args) {

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (! StdIn.isEmpty()){
            String s = StdIn.readString();
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if(s.equals(")")){
                String op = ops.pop();
                Double val = vals.pop();

                if (op.equals("+")) val = val + vals.pop();
                else if (op.equals("-")) val = val - vals.pop();
                else if (op.equals("*")) val = val * vals.pop();
                else if (op.equals("/")) val = val / vals.pop();
                else if (op.equals("sqrt")) val = Math.sqrt(val);
                vals.push(val);
            }
            else vals.push(Double.parseDouble(s));
        }
        System.out.println(vals.pop());

    }

}

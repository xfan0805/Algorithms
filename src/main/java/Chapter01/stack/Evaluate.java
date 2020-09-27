package Chapter01.stack;

import edu.princeton.cs.algs4.Stack;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: Algorithms
 * @description:
 * 例子：( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
 * @author: xfan
 * @create: 2020-09-25 10:13
 **/

public class Evaluate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //next()读一个字符，以空格为分隔符
        //nextLine() 读一行
        String str = input.nextLine();
        System.out.println(str);
        String[] strings = str.split(" ");
        System.out.println(Arrays.toString(strings));

        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        for (String s : strings){
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

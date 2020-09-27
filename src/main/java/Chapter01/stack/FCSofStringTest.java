package Chapter01.stack;

import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description:
 *
 * 例句： to1 be1 or not to2 - be2 - - that - - - is
 * @author: xfan
 * @create: 2020-09-25 19:06
 **/

public class FCSofStringTest {

    public static void main(String[] args) {

        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);

        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String item = input.next();
            if (!item.equals("-")){
                s.push(item);
            }else if (!s.isEmpty()){
                System.out.println(s.pop() + " ");
            }
            System.out.println(s);
        }
        System.out.println("(" + s.size() + " left on stack)");
        System.out.println(s);

    }

}

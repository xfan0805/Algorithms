package Chapter01.stack.Iterator;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description:
 * to1 be1 or not to2 - be2 - - that - - - is
 * @author: xfan
 * @create: 2020-09-25 19:46
 **/

public class RASTest {

    public static void main(String[] args) {

        ResizingArrayStack<String> s;
        s = new ResizingArrayStack<String>(100);

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

        for (String ss : s){
            System.out.println(ss);
        }

    }

}

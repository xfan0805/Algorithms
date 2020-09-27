package Chapter01.stack;

import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * @program: Algorithms
 * @description:
 * 例句： to1 be1 or not to2 - be2 - - that - - - is
 * @author: xfan
 * @create: 2020-09-25 19:30
 **/

public class FCSTest {
    public static void main(String[] args) {

        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);

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

        for (String ss  : s){
            System.out.println(ss);
        }
    }
}

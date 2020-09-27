package someTest;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 21:02
 **/

public class Test02 {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        System.out.println(a == b);

        String s = "dd";
        String ss = "dd" ;
        System.out.println(ss == s);

        eat(10);

    }


    public static void eat(int n){
        int e ;

        e = (int)(Math.random()*2 + 1);

    }

}

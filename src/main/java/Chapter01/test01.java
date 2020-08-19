package Chapter01;

/**
 * @program: Algorithms
 * @description:  求最大公约数的算法
 * @author: xfan
 * @create: 2020-07-29 23:00
 **/

public class test01 {

    public static void main(String[] args) {

        int i = gcd(20,10);
        System.out.println(i);

    }

    public static int gcd(int p,int q){

        if (q == 0){
            return p;
        }

        int r = p%q;  //  % 取余数
        System.out.println(r);
        return gcd(q,r);

    }

}

package Chapter01;

import java.util.Arrays;
import edu.princeton.cs.algs4.*;
/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-08-16 10:58
 **/

public class ArrayTest {

    public static void main(String[] args) {

        int[] a = {11,2,3,4};
        System.out.println(a[3]);
        System.out.println(Arrays.toString(a));

        for (int i=0;i<a.length/2;i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(a));

        System.out.println(a.length);
//        a[4] = 4;
//        System.out.println(a[4]);

        int[] b = new int[4];
        b[2] = 4;
        System.out.println(Arrays.toString(b));

        int[][] c = new int[2][];
        c[0] = new int[]{1, 2, 3};
        c[1] = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int n = 10;
        System.out.println(Arrays.toString(a));
        changesome(a);
        System.out.println(Arrays.toString(a));


        System.out.println(String.format("ss%d", 22));

        changesome(n);
        System.out.println(n);

        String s = "ddd";
        changesome(s);
        System.out.println(s);

        String s1=new String("abc");
        String s2=s1.intern();
        String s3="abc";
        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //true
        System.out.println(s1==s3); //false

        Counter cc = new Counter("dd");
        cc.increment();
        System.out.println(cc);
        Counter dd;
        dd = cc;
        dd.increment();

        System.out.println(dd);

        int aa = 1;
        int bb = aa;
        bb = bb + 22;
        System.out.println(bb);
        System.out.println(aa);

        String ss = "ss";
        String sss = ss;
        sss = sss + "sds";
        System.out.println(ss);
        System.out.println(sss);


        ArrayTest aaa = new ArrayTest();
        System.out.println(aaa.ArrayTest());

    }

    public static void changesome(int[] n){
        for (int i=0;i<n.length;i++){
            n[i]++;
        }
    }

    public static void changesome(int n){
        n = 2000;
    }

    public static void changesome(String n){
        n = n + 2000;
    }

    public String ArrayTest(){
        return "gg";
    }

    public ArrayTest() {
    }
}

package Chapter01.Queue;

import com.sun.xml.internal.ws.api.client.WSPortInfo;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: Algorithms
 * @description: 队列测试， 队列Queue 为先进先出 FIFO
 * @author: xfan
 * @create: 2020-09-21 15:18
 **/

public class readInts {

    public static void main(String[] args) {

        String path = "E:\\IdeaProjects\\Algorithms\\src\\main\\java\\Chapter01\\Queue\\testQueue.txt";

        int[] a = readInts(path);
        System.out.println(Arrays.toString(a));

        int[] ints = readFile(path);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] readInts(String name){
        In in = new In(name);
        Queue<Integer> q = new Queue<Integer>();
        while (!in.isEmpty()){
            q.enqueue(in.readInt());
        }

        int N = q.size();
        int a[] = new int[N];
        for (int i = 0; i < N; i++){
            a[i] = q.dequeue();  //删除队列中的元素，并将删除的返回值赋值给数组a
        }

        return a;

    }

    public static int[] readFile(String name){

        File file = new File(name);
        List<String> strLi = new ArrayList<String>();

        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream(file),"utf8");

            BufferedReader br = new BufferedReader(reader);
            String str;
            while ((str = br.readLine()) != null){
                String[] strings = str.split(" ");
                for (String s : strings){
                    if (s.length()>0)
                        strLi.add(s);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int N = strLi.size();
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++){
            intArr[i] = Integer.parseInt(strLi.get(i));
        }

        return intArr;

    }

}

package someTest;

import java.util.*;


/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 14:34
 **/

public class MapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(5, 55);
        map.put(4, 44);
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
        }

        System.out.println("####################################");

        map = new LinkedHashMap<Integer, Integer>();
        map.put(5, 55);
        map.put(4, 44);
        map.put(1, 11);
        map.put(2, 22);
        map.put(3, 33);

        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }


}

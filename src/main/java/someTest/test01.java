package someTest;

/**
 * @program: Algorithms
 * @description:
 * @author: xfan
 * @create: 2020-09-21 15:42
 **/

public class test01 {

    public static void main(String[] args) {
        int y = getY(0);
        System.out.println(y);
    }

    public static int getY(int x){
        int y = 0;
        if (x < 0){
            y = x -2;
        }else if (x > 0){
            y = x + 2;
        }else if (x == 0){
            y = x;
        }

        return y;
    }

}

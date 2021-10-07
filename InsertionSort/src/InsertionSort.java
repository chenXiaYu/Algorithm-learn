import java.util.Arrays;

/**
 * 选择排序
 * [-4, -1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 11, 32, 44, 63, 100]
 */
public class InsertionSort {
    public static void main(String[] args) {

        int[] arry = {9,8,7,6,3,2,1,1,2,4,5,63,32,3,-1,3,-4,44,11,100};

        System.out.println(Arrays.toString(arry));

        // 这里i之前的数组是有序的
        for (int i = 0; i < arry.length; i++) {
            int end = i + 1;
            if (end < arry.length) {
                if (!greater(arry[end], arry[i])) {
                    exchange(arry, end);
                }
            }
        }


        System.out.println(Arrays.toString(arry));

    }

    public static  void sort(int[] arry){
        for (int i = 0; i < arry.length; i++) {
            int end = i + 1;
            if (end < arry.length) {
                if (!greater(arry[end], arry[i])) {
                    exchange(arry, end);
                }
            }
        }
    }


    /**
     * @param arry
     * @param postion 比较到的那个尾数
     */
    public static void exchange(int[] arry, int postion) {
        int temp = arry[postion];
        for (int i = 0; i < postion; i++) {
            if (arry[i] > temp) {
                //找到一个比他还要大的数然后插入比他大的数的位置，后续的数字向右移动一位
                move(arry, i, postion);
                break;
            }
        }
    }

    public static void move(int[] arry, int start, int end) {
        int temp = arry[end];
        for (; end > start; end--) {
            arry[end] = arry[end - 1];
        }
        arry[start] = temp;
    }

    /**
     * @param a
     * @param b
     * @return a>b true
     */
    public static boolean greater(int a, int b) {

        if (a > b) {
            return true;
        } else {
            return false;
        }

    }
}

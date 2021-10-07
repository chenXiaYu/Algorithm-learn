import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) throws Exception {

        int[] data = DataUtils.getData();
        long l = System.currentTimeMillis();
        sort(data);
        System.out.println(System.currentTimeMillis()-l);

       // System.out.println(Arrays.toString(data));

    }

    public  static  void  sort(int[] arry){
        // 注意这种写法的时候最大值放在最左边，最左边的数据是排好序的了
        for(int i = 0; i < arry.length; i++){
            int index = i + 1 ;
            for( ; index < arry.length ; index++){
                if(greater(arry[i],arry[index])){
                    exchange(arry,i,index);
                }
            }
        }
    }




    /**
     * 数组参数位置交换
     * @param arry
     * @param left
     * @param right
     */
    public  static  void exchange(int[] arry, int left, int right){
        int temp = arry[left];
        arry[left] = arry[right];
        arry[right] = temp;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean greater(int a , int b ){

            if(a>b){
                return  true;
            }else {
                return  false;
            }

    }

}


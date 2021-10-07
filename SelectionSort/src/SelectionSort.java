import java.util.Arrays;

/**
 * 选择排序 和 插入排序的区别是
 * 选择排序一次八后面的最值取出来
 * 而插入排序是依次拍前面的数，然后移动位置
 * */
public class SelectionSort {
    public static void main(String[] args) {

        int [] arry =  {9,8,7,6,3,2,1,1,2,4,5,63,32,3,-1,3,-4,44,11,100};


        for(int i = 0; i < arry.length; i++){
            int index = i + 1 ;
            int minIndex = -1;
            int temp = arry[i];
            for( ; index < arry.length ; index++){
                if(greater(temp,arry[index])){
                    minIndex = index;
                    temp = arry[index];
                }
            }

            //取到最小值赋值到前面
            if(minIndex !=-1){
               exchange(arry,i,minIndex);
            }
        }

        System.out.println(Arrays.toString(arry));

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
     * @return a>b true
     */
    public static boolean greater(int a , int b ){

        if(a>b){
            return  true;
        }else {
            return  false;
        }

    }
}

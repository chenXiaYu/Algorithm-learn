import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 希尔排序
 * -------------------
 * 开始排序..
 * 30  自动拆装箱影响
 * ---------
 * 21
 *
 * 先按照间隙分组，然后组内调用插入排序
 */
public class ShellSort {

    public static void main(String[] args) throws Exception {
        int[] data = DataUtils.getData();
        long l = System.currentTimeMillis();
        sort(data);
        System.out.println(System.currentTimeMillis()-l);

//        int [] arry =  {9,8,7,6,3,2,1,1,2,4,5,63,32,3,0,0,0};
//        Integer [] objects = new Integer[arry.length];
//        for(int i = 0 ; i < arry.length; i ++){
//            objects[i] = arry[i];
//        }
//        sort(arry);
//        System.out.println(Arrays.toString(arry));
//        Shell.sort(objects);
//        System.out.println(Arrays.toString(objects));
    }

    public static  void sort(int[] arry){
        int gap = arry.length /2;

        while (gap>0){
            for(int i = 0 ; i+ gap < arry.length; i++){
                int nextgap = i+gap;
                for( ;nextgap>=0 && nextgap-gap>=0; nextgap = nextgap - gap){
                    if(arry[nextgap]<arry[nextgap-gap]){
                        int temp = arry[nextgap];
                        arry[nextgap] =  arry[nextgap-gap];
                        arry[nextgap-gap] = temp;
                    }else {
                        //
                        break;
                    }
                }
            }
            gap = gap/2;
        }
    }

}

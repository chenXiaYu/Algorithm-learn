import java.util.Arrays;

/**
 * 归并排序
 * 思路  先对数组拆分，直到每个项为1 然后再把他们按照顺序合并回来
 * [1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 32, 63]
 * [1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 32, 63]
 */
public class MergeSort {

    public static void main(String[] args) throws Exception {
       // int [] arry =  {9,8,7,6,3,2,1,1,2,4,5,63,32,3};
        int [] arry = DataUtils.getData();
        long start = System.currentTimeMillis();
        sort(arry);
        System.out.println(System.currentTimeMillis()-start);
        //System.out.println(Arrays.toString(arry));
    }


    public static void sort(int[] arry){
        int end = arry.length -1 ;
        int start = 0;
        sort(arry,start,end);
    }

    public static  void sort(int[] arry , int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        sort(arry,start,mid);
        sort(arry,mid+1,end);
        merge(arry,start,mid,end);
    }

    /**
     * 注意这里的start ,mid end 都是数组的坐标，切忌混淆
     * @param arry
     * @param start
     * @param mid
     * @param end
     */
    public  static  void merge(int [] arry ,int start,int mid , int end){
        int length = end - start + 1;
        int [] temp = new int[length];
        int indexa = start;
        int indexb = mid+1;
        int i = 0 ;
        while(indexa<=mid || indexb <= end ){

            if(indexa>mid){
                temp[i] = arry[indexb];
                indexb++;
                i++;
                continue;
            }

            if(indexb>end){
                 temp[i] = arry[indexa];
                indexa++;
                i++;
                continue;
            }

            if(arry[indexa]<arry[indexb]){
                temp[i] = arry[indexa];
                indexa++;
                i++;
            }else {
                temp[i] = arry[indexb];
                i++;
                indexb++;
            }

        }

        for(int k = 0 ; k < temp.length; k++){
            arry[start] = temp[k];
            start++;
        }

    }
}

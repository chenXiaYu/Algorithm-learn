import itcast.Quick;

import java.util.Arrays;

/**
 * 快速排序
 * 思路： 就是开始以某一个值为基准从右边开始寻找比他小的值然后再从左边寻找比他大的值然后交换两个值的位置，
 * 然后指针继续从右边开始找到比他打的，然后在继续左边的指针，持续到左右两边的指针再同一个位置，
 * 然后把基准值移动到该指针位置，然后左边的数比
 * 基准小，右边的比基准打，然后左右两边的继续这样不断分成两半排序，当分到一组只有两个的时候，对着两个再排一次顺序
 * 就全部有序了
 * 这里的基准以左边第一个数字为基准
 *
 * 注意左边的基准指针从基准值开始，要从左边开始时先自增，不能先自增，若先自增，若下一个位置刚值大于前面的基准值交换位置就顺序错误了
 */
public class QuickSort {

    public static void main(String[] args) throws Exception {
        int[] data = DataUtils.getData();
        Integer[] data2 = DataUtils.getDataInteger();
        System.out.println("开始排序");
        long start = System.currentTimeMillis();
       // Quick.sort(data2);
        sort(data);
        System.out.println(System.currentTimeMillis()-start);
      // System.out.println(Arrays.toString(data));
    }


    public static void sort(int[] arry){
           sort(arry,0,arry.length-1);
    }

    public static  void sort(int[] arry , int start , int end){

          if(end-start==1){
              //两个值的时候直接比较
              if(arry[start]>arry[end]){
                  int exchange = arry[start];
                  arry[start] = arry[end];
                  arry[end] = exchange;
                  return;
              }
          }

          int basic = arry[start];
          int startbak = start;
          int endbak = end;
          boolean stop = true;

          while (start!=end  && start < end ){
              //从右边开始寻找找到一个比基准小的
              while (start!=end && start < end ){
                  if(arry[end]<basic){
                      break;
                  }
                  end--;
              }

              while (start!=end  && start < end  ){
                  start++;
                  if(start == end) break;

                  if(arry[start]>basic){
                      //找到左边最大然后交换继续从右边开始
                      int temp = arry[end];
                      arry[end] = arry[start];
                      arry[start] = temp;
                      end--;
                      stop = true;
                      break;
                  }
              }
          }
          //推出循环后start 和end 则是基准值应当放的位置
          arry[startbak] = arry[start];
          arry[start] = basic;

          //继续分裂

          if((start-startbak-1)>=1){
              sort(arry,startbak,start-1);

          }
          if((endbak-start-1 )>=1){
              sort(arry,start+1,endbak);

          }
    }
}

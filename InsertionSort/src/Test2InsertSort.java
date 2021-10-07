import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 7980
 * ---------
 * 1662
 */
public class Test2InsertSort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\TFS\\Algorithm-learn\\InsertionSort\\src\\resource\\reverse_arr.txt"));
        String value = null;
        List<Integer> arrs = new ArrayList<>();
        while((value = bufferedReader.readLine())!=null){
            arrs.add(Integer.valueOf(value.trim()));
        }
        Integer [] input = new Integer[arrs.size()];
        Integer[] ts = arrs.toArray(input);


        int[] values = Arrays.stream(ts).mapToInt(Integer::intValue).toArray();
        int[] values2 = Arrays.copyOf(values,values.length);

        //System.out.println(Arrays.toString(ts));

        System.out.println("-------------------");
        System.out.println("开始排序..");
        long start = System.currentTimeMillis();

        //Insertion.sort(input);   //这个对象比较涉及到拆装箱，速度会慢很多
        Insertion2.sort(values);   //由于采用逐位插入，速度还是有所下降

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        System.out.println("---------");

        InsertionSort.sort(values2);

        System.out.println(System.currentTimeMillis()-end);

        for(int i = 0 ; i < input.length; i++){
            if(values[i]!=values2[i]){
                System.out.println("排序异常");
            }
        }

    }
}

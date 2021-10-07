import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataUtils {


    public static   int[] getData() throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\TFS\\Algorithm-learn\\InsertionSort\\src\\resource\\reverse_arr.txt"));
        String value = null;
        List<Integer> arrs = new ArrayList<>();
        while((value = bufferedReader.readLine())!=null){
            arrs.add(Integer.valueOf(value.trim()));
        }
        Integer [] input = new Integer[arrs.size()];
        Integer[] ts = arrs.toArray(input);

        return  Arrays.stream(ts).mapToInt(Integer::intValue).toArray();
    }

    public static   Integer[] getDataInteger() throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\TFS\\Algorithm-learn\\InsertionSort\\src\\resource\\reverse_arr.txt"));
        String value = null;
        List<Integer> arrs = new ArrayList<>();
        while((value = bufferedReader.readLine())!=null){
            arrs.add(Integer.valueOf(value.trim()));
        }
        Integer [] input = new Integer[arrs.size()];
        Integer[] ts = arrs.toArray(input);
        return  ts;
    }

    public static   int[] getData2() throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\TFS\\Algorithm-learn\\InsertionSort\\src\\resource\\reverse_arr_2.txt"));
        String value = null;
        List<Integer> arrs = new ArrayList<>();
        while((value = bufferedReader.readLine())!=null){
            arrs.add(Integer.valueOf(value.trim()));
        }
        Integer [] input = new Integer[arrs.size()];
        Integer[] ts = arrs.toArray(input);

        return  Arrays.stream(ts).mapToInt(Integer::intValue).toArray();
    }
}

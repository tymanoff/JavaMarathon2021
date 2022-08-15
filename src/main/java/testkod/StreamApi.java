package testkod;

import java.util.Arrays;

public class StreamApi {
    public static void main(String[] args) {
        int[][] arr = {{1,1}, {1,1}};
        int[] arr2 = Arrays.stream(arr).flatMapToInt(Arrays::stream).map(i -> i+1).toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }


}

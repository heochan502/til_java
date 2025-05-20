package ch05.sec06;
import java.util.Arrays;

public class Mission02 {
    public static void main(String[]args)
    {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        //-----------------------------
//        int a=0;
//        a=arr[0];
//        arr[0]=arr[1];
//        arr[1]=a;
//
        arr[1] -= arr[0];
        arr[0] += arr[0];


        //-----------------------------
        System.out.println(Arrays.toString(arr));
    }
}

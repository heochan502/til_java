package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args)
    {
        //int[] arr = new int[] {100, 200, 300, 400, 500};//원시 .//레퍼런스//
        int[] arr = new int[5];
        int num = 0;
        String str = new String("dd");

        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*100;
        }
        System.out.println(Arrays.toString(arr));
    }
}

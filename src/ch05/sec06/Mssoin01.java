package ch05.sec06;

import java.util.Arrays;

public class Mssoin01 {
    public static void main(String[] args)
    {
        //int[] arr = new int[] {100, 200, 300, 400, 500};
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = (i+1)*100;
        }
        System.out.println(Arrays.toString(arr));
    }
}

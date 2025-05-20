package ch05.sec06;

import java.util.Arrays;

public class Mission04 {
    public static void main (String[] args)
    {
        int[] arr = {10,20,30,40,50,80};
        int sum = 0;
        //sum = Arrays.stream(arr).sum();
        for (int i=0; i< arr.length; i++)
        {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}

package ch05.sec06;

public class Mission08 {
    public static void main (String[] args)
    {
        int[] arr={77,34, 109,21, 101,200,48,10};
        int  min=arr[0];
        for(int i=1 ; i<arr.length; i++)
        {
            min = (min > arr[i]) ?  arr[i] : min;
        }
        System.out.println(min);
    }
}

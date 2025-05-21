package ch05.sec06;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30};

        //arr1 를 이용 하여서 똑같은 배열을 만든다.
        //1. 똑같은 크기의 공간할당
        int[] arr2 = new int[arr1.length];
        //2. arr1배열의 값을 arr2
        //arr2=arr1 =0;
        //arr2=arr1.clone();
        for (int i=0; i<arr1.length; i++)
        {
            arr2[i]=arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr1));
    }
}

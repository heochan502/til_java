package ch05.sec06;

import java.util.Arrays;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr={77,34, 109,21, 101,200,48,10};

        int temp = arr[0];
       // int temp2 =0;
        for (int i=0; i<arr.length; i++)
        {
           temp = (temp<arr[i]) ? arr[i] :temp;
//           temp= Math.max(arr[i],temp);
        }

        System.out.println(temp);
       // System.out.print(temp2);


        for (int i =0 ; i<arr.length; i++)
        {
            for (int k =0 ; k<arr.length; k++)
            {
                if (arr[i]<arr[k])
                {
                    temp = arr[k];
                    arr[k]=arr[i];
                    arr[i]= temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));

    }
}

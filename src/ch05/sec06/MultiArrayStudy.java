package ch05.sec06;

import java.util.Arrays;

public class MultiArrayStudy {
    /*
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[][] parent = {arr1, arr2};
        int[][][] parent2 = null;
        int[][][][]  parent3 = null;

     */
    public static void main (String[] args)
    {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};

        int[][] parent = {arr1, arr2};

        int [][] arr4 = {{10, 20, 30},{40, 50, 60}};

        System.out.println(Arrays.toString(arr4[1]) );
        System.out.println( parent[0][1] );
        System.out.println( parent[1][1] );


    }

}

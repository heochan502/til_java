package ch05.sec06;

public class MultiArrayStudy02 {
    public static void main (String[] args)
    {
        int[][] arr = {
                {10 ,20, 30},
                {40 ,50, 60},
                {70}
        };

        System.out.println("arr.length: " + arr.length);
        System.out.println("arr[0].length: " + arr[0].length);
        System.out.println("arr[2].length: " + arr[2].length);
        int[] child0 = arr[0];
        int[] child1= arr[2];


        for (int[] row : arr)
        {
            {
                for(int element : row)
                    System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");
        for (int k = 0; k < arr.length; k++) {

            for (int z = 0; z < arr[k].length; z++) {
                System.out.print(arr[k][z] + " ");
            }
            System.out.println();
        }



    }

}

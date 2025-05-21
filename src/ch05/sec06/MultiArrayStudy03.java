package ch05.sec06;

public class MultiArrayStudy03 {
    public static void main (String[] args)
    {
        int[][][] arr = {{
                {10 ,20, 30},
                {40 ,50, 60},
                {70}
        },
                {
                        {80 ,90, 100},
                        {100 ,50, 60},
                        {70}
                }
        };



        for (int[][] row2 : arr)
        {

                for(int[] row1 : row2){
                    for(int element : row1)
                    {
                        System.out.print(element + " ");
                    }
                System.out.println();
            }

        }

//        System.out.println("------------------------------------");
//        for (int k = 0; k < arr.length; k++) {
//
//            for (int z = 0; z < arr[k].length; z++) {
//                System.out.print(arr[k][z] + " ");
//            }
//            System.out.println();
//        }



    }

}

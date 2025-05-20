package ch05.sec06;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i =0;
        for ( i=0; i<arr.length; i++)
        {
            arr[i]=i+10;
        }
        for ( i=0;i<arr.length; i++) {
            System.out.printf("arr[%d] : %d \n", i,arr[i]);
        }
    }
}

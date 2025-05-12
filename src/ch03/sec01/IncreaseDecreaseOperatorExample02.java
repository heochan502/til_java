package ch03.sec01;

public class IncreaseDecreaseOperatorExample02 {
    public static void main (String[] args)
    {
        int i1 = 5;
       // i1++; 읽기 후 쓰기

        System.out.printf("i1 : %d\n" , i1++); // 5
        System.out.printf("i1 : %d\n" , i1++); //6
        System.out.printf("i1 : %d\n" , i1++); //7

        System.out.printf("---------------\n" );

        int i2 = 5;
     //   ++i2; 쓰기 후 읽기
        System.out.printf("i2 : %d\n" ,++i2); //6
        System.out.printf("i2 : %d\n" ,++i2); //7
        System.out.printf("i2 : %d\n" ,i2); //7
    }
}

package ch05.sec06;

import java.util.Arrays;

public class ArrayStudy {
    /*
        사용이유 : 같은 타입의 여러 값을 저장하기 위함.

        정수값 10개를 저장하려고 하면 변수 선언을 10개를 해야한다.
        각 변수 선언마다 변수 이름을 할당해주어야 한다.
        모두 다른 이름을 주어야한다. 그래야 구분이 가능하기 때문.

        int n1, n2, n3, n4, n5, n6 .... n10;

        c언어 방식
        int n[num];
        int[] num;
        배열을 사용하면 엄청 많은 변수 공간도 간단하게 할당할 수 있다.
        1. 배열 선언
        타입[] 변수명;
        int n1; // 값을 저장할 수 있는 변수 // 값이 1개 저장되는것 Primitive 값
        int[] arr1; // 배열의 주소값 저장할 수 있는 변수 // 주소값 1개가 저장되는곳 레퍼런스 값

        2. 배열 생성
        new int[5]; // int 타입의 값을 저장 할 수 있는 공간이 5개 마련
        new int[1000] // int 타입의 값을 저장할 수 있는 공간이 1,000개 마련
     */
    public static void main(String[]args)
    {
        int[] arr1 = new int[10]; // 인덱스 (방 번호) 0~9 // 배열 초기화 자동으로되어서 0 으로 입려되어 있다

        int len = 100;
        int[] arr2= new int[len];


        //쓰기
        arr1[0] = 10;
        arr1[5] = 100;


        //읽기
        int num = arr1[0];

        System.out.println("num: "+ num);
        System.out.println("num: "+ arr1[0]);
        System.out.println("num: "+ arr1[1]);
        System.out.println(Arrays.toString(arr1));
        System.out.println("num: "+ arr1[5]);
        System.out.println("arr1.length: " +arr1.length);
        for (int i= 0 ;  i<arr1.length; i++)
        {
            System.out.printf("arr1[%d] : %d ", i, arr1[i]);
        }
        System.out.println();
    }
}

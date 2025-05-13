package ch04.sec04;

public class ForStudy02 {
    public static void main (String[] args)
    {

        System.out.println("-----------------------------(1)");

        for (int i=0; i < 5; i++){
          //  for (int i2=0; i2 < 10_000_000; i2++){ 이런식으로 000 구분자 _ 로 넣을수있
            //System.out.printf("i1 : %d\n" , i);
            System.out.println("Hello World");
        }

        //
        System.out.println("----------------------------(2)");
        // i<15 수정 불가
        //Hello World!! 5번 출력
        for(int i=10; i<15; i++)
        {
            System.out.println("Hello World!!");
        }

        System.out.println("-----------------------------");
        // i<15 수정 불가
        //Hello World!! 5번 출력
        for(int i=0; i<15; i+=3)
        {
            System.out.println("Hello World!! " + i);
        }
        System.out.println("----------------------------(3)");
        //i-- 수정 불가 나머지 수정 가능
        //Hello World!! 3번 출력
        for(int i=3; i>0; i--)
        {
            System.out.println("Hello World!!");
        }

    }
}

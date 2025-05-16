package ch04.sec05;
import java.util.Scanner;
public class WhileStudy {
    /*
        반복문 2개
        for loop : 몇 번 반복해야하는지 정확히 알 때 사용
        while loop : 언제 반복을 멈춰야하는지 알 때 사용

        // while (조건식){
        실행문
        }

     */
    public static void main (String[] args)
    {
       // Scanner Scan = new Scanner(System.in);
     //   int num = Scan.nextInt();

        for (int i=0; i<10; i++)
        {
            System.out.print(" "+ i);
        }
        System.out.println();
        System.out.println("--------------------------");
        int i =0;

        while(i<10)
        {
            System.out.print(" "+ i++);
        }


    }


}

package ch04;
import java.util.Scanner;


public class Mission09 {
    public static void main(String[] args)
    {
        //Scanner scan = new Scanner(System.in);
        //System.out.print("구구단 단수 입력해주세요.:  ");
        //int gugu = scan.nextInt();
        //int dan = (int)(Math.random()*8) +2; // 2~9 사이 랜던값

        /*for (int i =1; i <10; i++) {
        //System.out.printf("%d x %d = %d\n", dan, i, i*dan);
            System.out.printf("%d x %d = %d\n", gugu, i, i*gugu);
            //dan = (int)(Math.random()*8) +2;
        }*/


        for (int i =1; i <10; i++) {
            //  System.out.printf("%d x %d = %d\n", dan, i, i*dan);
            for (int j=1; j<10; j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, j*i);
            }
            System.out.println();

            //System.out.printf("%d x %d = %d\n", gugu, i, i*gugu);
            //dan = (int)(Math.random()*8) +2;
        }



    }
}

package ch04;
import java.util.Scanner;

public class Mission11 {
    public static void main(String[] args)
    {
        Scanner _scan =  new Scanner(System.in);
        System.out.println("구구단 할 숫자 2개를 입력해주세요 (예.. 10 9 ");
        int _num1 =  _scan.nextInt();
        int _num2 =  _scan.nextInt();
        //int _num3 =  _scan.nextInt();
       // System.out.println("구구단 몇단 까지 할까요 ?");
      //  int _num2 =  _scan.nextInt();
        //String _star = "*";

        for (int i =2; i <=_num1; i++) {
            //  System.out.printf("%d x %d = %d\n", dan, i, i*dan);
            for (int j=1; j<=_num2; j++)
            {
                System.out.printf("%d x %d = %d\n", i, j, j*i);
            }
            System.out.println();

            //System.out.printf("%d x %d = %d\n", gugu, i, i*gugu);
            //dan = (int)(Math.random()*8) +2;
        }

    }
}

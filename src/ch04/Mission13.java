package ch04;

import java.util.Scanner;

public class Mission13 {
    public static void main (String[] args)
    {
        /*  2 x 1 = 2 \t 3x1 =3 .......*/
        /*
        Scanner _scan = new Scanner(System.in);
        System.out.println("최대 단수를 입력하세요 : ");
        int in_num = _scan.nextInt();


        for (int i=1; i < 10; i++){
            for (int j=2; j <= in_num; j++){
                System.out.printf("%d x %d = %d  \t" , j, i, j*i);
            }
         System.out.println();
        }
        */

        int star = (int)(Math.random()*6.0) + 3;
        String _star = "*";
        System.out.printf(" %d ", star);

        for (int i=0; i<=star; i++)
        {
            for (int j=0 ; j<i ; j++)
            {
                System.out.printf("%s", _star);
            }
            System.out.println();
        }


        for (int i=star; i>0; i--)
        {
            for (int j=0 ; j<i ; j++)
            {
                if
                System.out.printf("%s", _star);
            }
            System.out.println();
        }


    }
}

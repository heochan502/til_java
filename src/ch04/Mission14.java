package ch04;

import java.util.Scanner;

public class Mission14 {
    public static void main (String[] args)
    {

       // int star = (int)(Math.random()*6.0) + 4;

        Scanner _scan = new Scanner(System.in);
        System.out.println("최대 단수를 입력하세요 : ");
        int star = _scan.nextInt();

        String _star = "*";
        String _bl = "_";
       // System.out.printf(" %d \n", star);


        for (int i=star; i> 0; i--)
        {
            for (int j=0 ; j<star ; j++)
            {
                //System.out.printf("%d", i );
                System.out.printf("%s", ( (star - i) >j  ) ? _bl : _star );
            }
            System.out.println();
        }

        for (int i=0; i <star; i++)
        {
            for (int j=0 ; j<star ; j++)
            {
                //System.out.printf("%d", i );
                System.out.printf("%s", ( (star - i) >j  ) ?  _star :_bl );
            }
            System.out.println();
        }


       // System.out.printf(" %d \n", star);
        for (int i=star; i >0; i--)
        {
            for (int j=1 ; j<=star ; j++)
            {
                //System.out.printf("%d", i );
                System.out.printf("%s", ( i > j  ) ?  _bl :_star );
            }
            System.out.println();
        }



        System.out.println("===========================");
        for(int i=star; i>0; i--) {

            int k=1;
            for( ; k<i; k++) {
                System.out.print("_");
            }
            for( ; k<=star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("===========================");
        for(int i=star; i>0; i--) {

            for(int k=1; k<=star; k++) {
                System.out.print(k < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}

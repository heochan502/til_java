package ch04;
import java.util.Scanner;

public class Mission10 {
    public static void main(String[] args)
    {
        Scanner _scan =  new Scanner(System.in);
        System.out.println("별숫자를 입력해주세요");
        int star_num =  _scan.nextInt();
        String _star = "*";

        int star = (int)(Math.random()*4.0)+3;
/*
        for (int i=0; i <star_num; i++)
        {
            for (int k =0 ; k< star_num; k++)
            {
                System.out.printf("*");
            }
            System.out.println();
        } */

    /*
        for (int i=0; i <star_num; i++)
        {
            for (int k =0 ; k< star_num; k++)
            {
                System.out.printf("%s", k<star_num/2 ?  _star : " ");
            }
            System.out.println();
        } */
        int temp = star_num * star_num;
        for (int i=1 ; i<= temp; i++ )
        {
            System.out.printf("%s",_star);
            //System.out.printf("3%d\n",temp);
            if (i%star_num == 0){
                System.out.println();
            }
        }



        /*
        int i=0,j=0;
        for (; j <star_num; i++)
        {
            //System.out.printf("%s", i<star_num ?  _star : j++ );
            i =i<star_num ?  _star : j++;

            boolean temp =(star_num%i) == 0 ?  System.out.printf("%s",_star) : System.out.println();
        }*/
    }
}

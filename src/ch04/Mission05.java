package ch04;
import java.util.Scanner;

public class Mission05 {
    public static void main(String[] args)
    {
        int starCount = (int)(Math.random() * 6.0) + 2; // 1) 2~7사이 랜덤값
        Scanner scan = new Scanner(System.in);
        System.out.print("별의 갯수를 입력해주세요.:");
        int Star_num = scan.nextInt();

        String _star="*";
/*
        for (int i =1 ; i<Star_num; i++ )
        {
            System.out.printf("%s",_star);
        }
        System.out.println();

        for (int i = Star_num ; i>0; i-- )
        {
            System.out.printf("%s",_star);
        }
        System.out.println();
*/


        for (int i = 0 ; i<=Star_num; i++ )
        {
            for (int j =0; j<i;j++){
            System.out.printf("%s",_star);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0 ; i<=Star_num; i++ )
        {
            for (int j =0; j<i;j++){
                System.out.printf("%s",_star);
            }
            System.out.println();
        }
        System.out.println();


//        for (int i=0; i<10; i++)
//        {
//            for (int j=0; j<starCount; j++)
//            {
//                System.out.printf("%s", _star);
//            }
//            System.out.println();
//            starCount = (int)(Math.random() * 6.0) + 2;
//        }



    }
}

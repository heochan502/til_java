package ch04.sec05;
import java.util.Scanner;

public class Mission01 {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int num=0;
        boolean go_stop=true;
        /*
        합계를 구할 숫자를 입력하세요.(종료0)
        >>100
        >>200
        >>0
        합계 : 300
        * */
        System.out.println("합계를 구할 숫자를 입력하세요.(종료 0) ");
        while (go_stop)
        {
            System.out.print(">>");
            num = scan.nextInt();
            sum +=num;
            if (num ==0){
                go_stop = false;
            }
        }
        System.out.printf("합계: %,d\n", sum);
    }
}

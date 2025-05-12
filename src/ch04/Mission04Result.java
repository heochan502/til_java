package ch04;
import java.util.Scanner;

public class Mission04Result {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요.:");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);


       // int score = (int)(Math.random()*201) ; //0~200랜덤값
        String temp="A";
        System.out.println(score);

        if (score < 0 || score >100 ){
            System.out.println( "측정불가");
        }
        else
        {
            String result ="D";
            if (90 <= score ){
                result ="A";
            }
            else if (80 <= score ){
                result ="B";
            }
            else if  (70 <= score ){
                result ="C";
            }
            System.out.printf("%s 학점입니다.", result);
        }


        // 만약 score 값이 100~90점 사이면 A학점
        // 만약 score 값이 80~89점 사이면 B학점
        System.out.println("----끝 ----");
    }
}

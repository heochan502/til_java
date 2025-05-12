package ch04;
import java.util.Scanner;

public class Mission04 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요.:");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);


       // int score = (int)(Math.random()*201) ; //0~200랜덤값
        String temp="A";
        System.out.println(score);
        if (90 <= score && score <= 100){
            temp ="A";
        }
        else if (80 <= score && score <= 89){
            temp ="B";
        }
        else if  (70 <= score && score <= 79){
            temp ="C";
        }
         else if  ( score > 0 && score < 70){
            temp ="D";
        }
        else if (score < 0 || score >100 ){
            temp = "측정불가";
        }
        System.out.printf("%s\n", temp != "측정불가" ? temp+"학점": temp);
        // 만약 score 값이 100~90점 사이면 A학점
        // 만약 score 값이 80~89점 사이면 B학점
        System.out.println("----끝 ----");


        if (score < 0 || score >100 ){
            temp = "측정불가";
        }
        else if (90 <= score ){
            temp ="A";
        }
        else if (80 <= score ){
            temp ="B";
        }
        else if  (70 <= score ){
            temp ="C";
        }
        else {
            temp ="D";
        }
        System.out.printf("%s\n", temp != "측정불가" ? "당신은 "+temp+"학점 입니다.": temp);
        // 만약 score 값이 100~90점 사이면 A학점
        // 만약 score 값이 80~89점 사이면 B학점
        System.out.println("----끝 ----");
    }
}

package ch04;
import java.util.Scanner;

public class Mission05 {
    public static void main(String[] args)
    {
        int starCount = (int)(Math.random() * 6.0) + 2; // 1) 2~7사이 랜덤값
        for (int i=0 ; i<10; i++){
            System.out.printf("starCount : %d\n", starCount);
            starCount = (int)(Math.random() * 6.0) + 2;
        }
    }
}

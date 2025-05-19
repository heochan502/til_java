package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        int num = (int)(Math.random()*100.0)+1;
        int in_num=0;
        System.out.printf("정답 : %d\n", num);

        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("1-100사이 숫자를 입력해주세요 > ");
            in_num = scanner.nextInt();
            if (in_num == num) {
                System.out.println("정답!! "+ num);
                break; // break를 감싸고 있는 가장 가까운 반복문을 빠져나온다.
            }
            System.out.printf("- %s! \n", (in_num > num) ?"Down" : "Up" );
        }
    }
}

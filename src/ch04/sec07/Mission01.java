package ch04.sec07;
import java.util.Scanner;
public class Mission01 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cash = 0;
        int inNum ;
        int inCash = 0;
        Bank:
        for (;;) {
            System.out.print("---------------------------------\n" +
                    "1.예금 | 2.출금 | 3.잔고 | 4.종료\n" +
                    "---------------------------------\n" +
                    "선택 > ");

            inNum = scanner.nextInt(); // nextInt() 는 문자열 조금이라도 섞이면 터진다
            switch (inNum) {
                case 1:
                    System.out.print("예금액 > ");
                    inCash = scanner.nextInt();
                    cash+=inCash;
                    break;
                case 2:
                    System.out.print("출금액 > ");
                    inCash=scanner.nextInt();
                    if ( cash >= inCash ){
                        cash-=inCash;      }
                    else {
                        System.out.print("금액이 부족해서 출금 불가 >\n");
                    }
                    break;
                case 3:
                    System.out.printf("잔고 > %,d\n", cash);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    break Bank;
                default:
                    System.out.println("너 숫자 잘못 입력했다.\n1~4까지 입력해라 인간.");
                    break;
            }
        }
    }
}

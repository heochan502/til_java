package ch04.sec05;
import java.util.Scanner;
public class KeyControlExample {
    public static void main (String[] args)
    {
            Scanner Scan = new Scanner(System.in);
            boolean run = true;
            int speed = 0;
            //int num = Scan.nextInt();

            while(run){
                System.out.println("----------------------------------");
                System.out.println("   1. 증속  |  2. 감속  |  3. 중지  ");
                System.out.println("----------------------------------");
                System.out.print("선택 : ");

                String strNum= Scan.nextLine();
            switch(strNum){
                case "1":
                    speed++;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case "2":
                    speed--;
                    System.out.println("증속 속도 = " + speed);
                    break;
                case "3":
                    run = false;
                }
            }
            System.out.println("--- 끝 ---");
    }
}

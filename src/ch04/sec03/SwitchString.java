package ch04.sec03;

import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. (w/m) > ");

        String gender = scanner.next();
        System.out.println( "gender : " +gender);

        //m을 입력하면 "당신은 남자입니다 "
        //w을 입력하면 "당신은 여자입니다 "
        switch (gender){
            case "w","여자","여","W":
                System.out.println("당신은 여자입니다.");
                break;
            case "m","남자","남","M":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println(" 넌 뭐냐 ");
                break;
        }

    }
}

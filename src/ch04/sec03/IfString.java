package ch04.sec03;
import java.util.Scanner;
public class IfString {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("성별을 입력해 주세요. (w/m) > ");

        String gender = scanner.next();
        System.out.println( "gender : " +gender);

        //m을 입력하면 "당신은 남자입니다 "
        //w을 입력하면 "당신은 여자입니다 "
        switch (gender){
            case "w":
                System.out.println("당신은 여자입니다.");
                break;
            case "m":
                System.out.println("당신은 남자입니다.");
                break;
            default:
                System.out.println(" 넌 뭐냐 ");
                break;
        }


        //if ("w".equals(gender)) //  이거는 에러 날일이없음//  gender가 null인 경우 비교 문에서 에러 터져서 오류 터짐
    //    if (gender.equals("w"))
        if ("w".equalsIgnoreCase(gender)) // 대문자 소문자 구별 안하고 구분함
        {
            System.out.println("당신은 여자입니다.");}
        else if (gender.equals("m"))
        {
            System.out.println("당신은 남자입니다.");
        }
        else
        {
            System.out.println(" 넌 진짜 뭔데 ");
        }
        // 삼항연산자
        System.out.printf("너의 성별은 %s \n",gender.equals("w") ? "여자": (gender.equals("m") ? "남자": "외계인") );
    }
}


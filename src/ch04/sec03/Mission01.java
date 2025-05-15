package ch04.sec03;

public class Mission01 {
    public static void main (String[]args)
    {
        int month = (int)(Math.random()*16.0);

        // switch 이용하여
        //month 값이 3,4,5 라면 "봄"
        //month 값이 6,7,8 라면 "여름"
        //month 값이 9,10,11 라면 "가을"
        //month 값이 12,1,2 라면 "겨울"
        // 나머지는 해당없음
        System.out.println(month);
        switch (month)
        {
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            case 12, 1, 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("해당 계절이 없습니다.");
                break;
        }

    }
}

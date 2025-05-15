package ch04.sec03;

public class SwitchStudy {
    /*
    switch에서는 관계연산자(<,>,>=,<=,!=) 사용할 수 없다.
    오로지 ==  equal 만 가능
    switch 는 case에 맞는 값이 있으면 진입을 하고 break; 키워드를 만날때까지 계속 실행함

    switch ( 변수 ) {
        case 값1:
             처리1;
              break;
        case 값2:
             처리2;
              break;
         case 값3:
             처리3;
             break;
        [...]
        default : // 이거 맨위에 가있어도 상관없음
            나머지 처리;
            break;(생략가능)
    }
    * */

    public static void main (String [] args)
    {
        int num=4;
        switch (num){
            case 1:
                System.out.println("1 입니다.");
            case 2:
            case 3:
                System.out.println("2 or 3 입니다.");
                break;
            default :
                System.out.println("값이 없네요.");
            case 4:
                 System.out.println("4 입니다.");
                 break;
        }
        System.out.println("-- 끝 -- ");
    }
}

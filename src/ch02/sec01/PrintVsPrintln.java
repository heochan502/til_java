package ch02.sec01;

public class PrintVsPrintln {
    public static void main (String[] args)
    { //print
        System.out.print("안녕");
        System.out.print("안녕\n");
        System.out.print("안녕");


        System.out.println();
        System.out.println("------------------------");

        //println
        System.out.println("Hello\n");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        //print + 개행(이스케이프 문자 \n)
        System.out.print("\"안녕\" \\n\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        // 테스트
        System.out.print("하이\nㅇㄹㅇㄹㅇㅇ\n안녕하세용 \n");
        System.out.println("하이\nㅇㄹㅇㄹㅇㅇ\n안녕하세용 ");


        /*
        * primitive type 원시타입
        * 정수 int long
        * 실수 float double
        * 불린 boolean
        * 문자 char
        *
        * 래퍼런스는 대문자로 시작함.
        * */

        // printf
        int age=22;
        String name ="홍길동";
        float height = 172.5f;
        // age, name, height 변수를 활용하여 아래처럼 출력 시켜주세요.

        System.out.println("제 이름은 : " + name + " 나이는 : " + age + " 이며, 키는 : "+ height +"cm 입니다." );

        System.out.printf("제 이름은 : %s 나이는 : %d 이며, 키는 : %.1f cm 입니다.\n", name, age, height);
        // 제이름을 홍길동이고 나이는 22살이며 키는 172.5cm입니다.
    }
}

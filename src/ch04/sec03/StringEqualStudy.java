package ch04.sec03;

public class StringEqualStudy {
    /**
     * 엄청 중요
     *p.158
     *
     *
     */
    public static void main(String[] args)
    {// 자바에서 가장 안 좋다고 평가되는 부분...
        String str1 = "hello";
        String str2 = "hello";
        // 문자열 비교는 == 은 하면 안된다
        // 같은 값이면 주소를 같은곳을 지정하고 있다가 값이 달라지면 다른 주소를 줌
        System.out.printf("1. %s == %s : %b\n", System.identityHashCode(str1) ,System.identityHashCode(str2), str1==str2 );
        str2 = "ddd";
        System.out.printf("1. %s == %s : %b\n", System.identityHashCode(str1) ,System.identityHashCode(str2), str1==str2 );
        System.out.printf("2. %s == %s : %b\n", str1, str2, str1.equals(str2) );
        System.out.printf("3 .%s == %s : %b\n", str1, str2, str2.equals(str1) );

        String str3= new String ("hello");
        String str4= new String ("hello");

        System.out.printf("4. %s == %s : %b\n", str3, str4, str3==str4 );
        System.out.printf("5. %s == %s : %b\n", str3, str4, str3.equals(str4) );
        System.out.printf("6. %s == %s : %b\n", str3, str4, str4.equals(str3) );
    }
}

package ch02.sec01;

public class VariableInitializationExample {
        public static void main (String[] args){
            int value; // 변수 선언(변수당 최초 한번), 선언을 할 때 데이터 타입을 지정!(int는 정수 타입)
            // 변수 사용 방법 2가지 : 읽기(Read), 쓰기 (Write)
            value = 10; // 쓰기

            int value2 = 20; // 쓰기 - 변수의 값을 변경한다. // 읽기는 변수의 값을 변경 하지않고 연산에 이용할때는 읽기
            int result = value + 10; // value 아래에 빨간색 언더라인, 컴파일 에러
            /*
            에러의 종류 크게 2가지
            - 컴파일 에러 : 실행을 할 수 없음. 컴파일 자체가 불가능. 문법적 문제가 있거나 명확한 문제가 보이면...
            - 런타임 에러
             */

            System.out.println("value 의 값 " + value);
            System.out.println("result 의 값 " + result);
        }
}

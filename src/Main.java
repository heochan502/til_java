//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 class와 파일명은 같아야한다 그래야 제대로된 실행이가능하다
 클래스라는 그릇을 만들어야한다.
 그릇에는 코드가 작성된다. (매소드, 변수 등등)
 클래스 이름은 파일 이름과 같아야한다.
 메인 매소드(Method)는 함수라고 보면된다.
 메인 매소드는 굉장히 중요한 매소드이다. 프로그램의 시작점.
 매소드를 만드는 것은 "매소드 정의" 라고 표현.
 매소드를 사용하는 것은 "매소드 호출"라고 표현.
 매소드가 호출 되면 매소드 내용이 한줄씩한줄씩 실행이 된다.


 class 이름은 Pascal Case 기법으로 작성
* Pascal Case : MyNameIsHong
* Camel Case : muNameIsHong
*  */
public class Main {
    public static void main(String[] args) { // 매소드 (Method), 메인 매소드(프로그램 시작점)

        System.out.printf("Hello and welcome!\n");
        System.out.printf("안녕 디지몬 \n");
        for (int i = 1; i <= 6; i++) { // 반복문, for문, for-loop
            System.out.println("i = " + i);
        }
    }
}

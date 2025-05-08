package ch02.sec01;

public class Mission01 {
    public static void main (String[] args)
    {
        int num1 = 11;
        int num2 = 22;
        System.out.println("num1 : " + num1 + num2);
        // 더하기 곱셈 같이있으면 사칙연산 순서로 무조건 더하기 보다 나누기 나 곱셈이 선진행
        // 1. "num1: " + num1
        // 2. "num1: " + 11
        // 3. "num1: " + "11"
        // 4. "num1: 11"
        // 5. "num1: 11" + num2
        // 6. "num1: 11" + 22
        // 7. "num1: 11" + "22"
        // 8. "num1: 1122" >> 연산의 결과

        System.out.println("num1 : " + (num1 + num2));
    }
}
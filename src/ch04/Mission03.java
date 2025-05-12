package ch04;

public class Mission03 {
    public static void main (String [] args)
    {
        int value = (int)(Math.random()*100) + 1; // 1~100사이의 랜던값 나오게 해주시고

        //System.out.println(value);
        String oddEven = "홀";
        if (value%2 ==0)
        {
            oddEven = "짝";
            //랜덤 값이 value = 54; 라면
            // 출력 : 54는 짝수입니다.
            System.out.println(value +"는(은) 짝수입니다." );
        }
            // 랜덤값이 value = 5; 라면
            // 출력 : 5는(은) 홀수 입니다.

            // 랜던 값이 value =97; 라면
            // 출력 : 97은 홀수입니다.
        System.out.printf("%d는(은) %s수 입니다.\n", value, oddEven);

        oddEven = ((value %2) == 0) ? "짝" : "홀";
        System.out.printf("%d는(은) %s수 입니다.\n", value, oddEven);

        System.out.printf("%d는(은) %s수 입니다.\n", value, ((value %2) == 0) ? "짝" : "홀");


    }
}

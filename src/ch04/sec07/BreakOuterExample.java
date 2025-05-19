package ch04.sec07;

public class BreakOuterExample {
    public static void main (String[] args){
        Haha: // 반복문에 이름주고 이름 준곳을 박살낼 수있다. Haha: for ~~ // 이런식으로 줘도된다 while에도 가능
        for (int i=2; i<=9; i++)
        {
            for (int k=1; k<=9; k++)
            {
                if(k==5){
                    break Haha;
                }

                System.out.printf("%d x %d = %d\n", i,k,i*k);
            }
        }
                System.out.print("---- 끝 ----" );
    }
}

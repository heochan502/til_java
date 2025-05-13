package ch04;

public class Mission08 {
    public static void main(String[] args)
    {
        /*
        int sum = 0;

        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;

        System.out.println("sum : "+ sum);
        sum=0;
        */
        // 1부터 100까지 다더한값
        int sum=0;
        for (int i=0 ; i<=100; i++)
        {
            sum+=i;
        }
        System.out.printf("%d", sum);
    }
}

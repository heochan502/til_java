package Other;

public class ScopeStudy02 {
    int sum; // 전역변수
    public static void main (String[] args)
    {
        int sum =0;
        for (int i=0; i<10 ; i++)
        {
            sum = sum + i;
            System.out.println(sum);
        }

    }
}

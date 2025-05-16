package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while(true)
        {
            int num = (int)(Math.random()*6.0)+1;
            if (num==6)
                break;
            System.out.print(" "+num+" ");
        }
            System.out.print("\n----- 종료 -----");

    }
}

package ch04;

public class Mission02 {
    public static void main(String[] args) {
        int result = 0;
        // 13~34

        for(int i =0; i<5; i++)
        {
           result = (int) ((Math.random()*22.0)+13);

            System.out.println(result);
        }
    }
}

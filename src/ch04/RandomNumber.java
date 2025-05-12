package ch04;

import java.sql.Time;

public class RandomNumber {
    public static void main (String[] args)
    {
        //API, Math.random()<-메소드임, 0.000000000 ~ 0.99999999, 절대 1안나온다
        System.out.println(Math.random());

        double value = 0.9999;
        double result = value * 10 ; //9.9999
        System.out.println("result : " + result);

        int intResult = (int)result; // 강제 형변화는 명시적 형변환, 9.9999 > 9 변환
        System.out.println("intResult : " + intResult);
    double value2 = 0.00002;
   System.out.println("value2: "+ (int)(value2 * 10.0)); //0
   System.out.println((int)Math.random() * 10.0); // 0 ~ 9

    }
}

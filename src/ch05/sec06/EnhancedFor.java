package ch05.sec06;

import java.awt.*;

public class EnhancedFor {
    /*
    향상된 for문

     배열 같은 시퀀스가 있는 콜렉션 사용 가능 함.

      for (하나의 값 담을 수 있는 변수 : 콜렉션)
      {

      }

     */
    public static void main (String[] args)
    {
        int[] inArr = {11,12,13,19,33};
        for (int num : inArr)
        {
            System.out.print(num+ " ");
        }
        System.out.println("\n--------------");
        for (int i =0; i<inArr.length; i++)
        {
            int num = inArr[i];
            System.out.print(num+ " ");
        }

    }
}

package ch04.sec08;

public class BreakContinueStudy {
    public static void main(String[] args){
        //10번 반복하는 for문 2개 작성
        for (int i=0; i<10;i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        for (int j=0; j<10; j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }
int sum=0;
        for (int j=0; j<10; j++){
            if(j%2==0)
                continue; // 여기서 바로 올라감
            sum+=j;
            System.out.println("j = "+ j);
            System.out.println("sum = "+sum);
        }
        for (int j=0; j<10; j++){
            if(j%2==0)
                continue;
            sum+=j;
            System.out.println("sum = "+sum);
        }
    }
}



package ch02.sec01;

public class VariableUseExample { // 패키지 이름과 class 이름이 합친게 클래스 풀네임이다. / 아마 호출할 때 쓸듯
    public static void main (String[] args) {
        int hour = 3; // 초기화
        int minute = 5;
        System.out.println(hour + " 시간"+ minute + " 분");
        // (1) hour + "시간"
        // (2) 3 + "시간"
        // (3) "3" + "시간"
        // (4) "3시간"
        // (5) "3시간" + minute
        // (6) "3시간" + 5
        // (7) "3시간" + "5"
        // (8) "3시간 5"
        // (9) "3시간 5" + " 분"
        // (10) "3시간 5분"
        // (11) 연산의 결과를 println이 콘솔에 출력한다.
        String stn = null;
        stn = hour + "시간 " + minute + "분 ";
        System.out.println(stn);

        int totalMinute = minute + hour * 60; //185
        System.out.println("총 " + totalMinute + "분");

        System.out.println(hour +  (minute + " 분"));
    }
}

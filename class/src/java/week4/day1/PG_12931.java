package week4.day1;

import java.util.*;

public class PG_12931{
    public int solution(int n) {
        int answer = 0;
        while(n != 0){
            answer += n % 10;
            n = n / 10;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) {
        PG_12931 sod = new PG_12931();
        int result1 = sod.solution(1234);

        if(result1 == 10) {
            System.out.println("통과");
        }else{
            System.out.println("통과하지 못함");
        }
    }
}
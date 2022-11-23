package basic.ch12;

public class bj {
    public static void main(String[] args) {
        int cnt = 0;
        int a, b, c;
        for(int i = 1; i <= 1000; i++) {
            // 1000을 기준으로 각 자리의 수를 구해보자.
            a = i / 100 % 10;  // 셋째 자리
            b = i / 10 % 10;   // 둘째 자리
            c = i % 10;        // 첫째 자리


            // a가 0일 경우는 b부터 센다. - 두 자리 수 => 모두 한수
            // a와 b가 0일 경우         - 한 자리 수 => 모두 한수
            // 등차수열은 연속된 두 개의 수의 차이가 일정한 수열
            // b - a 가 c - b 와 d - c와 같아야 한다.
            if(i < 100) {
                cnt++;
            } else if((b - a) == (c - b)) {
                if(i != 1000)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}

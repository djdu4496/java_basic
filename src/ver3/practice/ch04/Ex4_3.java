package ver3.practice.ch04;
// 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + ... + (1 + 2 + 3 + 4 + ... + 10)의 결과를 계산하시오.
public class Ex4_3 {
    public static void main(String[] args) {
        int sum = 0;  // 숫자들의 합을 저장하기 위한 변수 sum 선언 및 0으로 초기화

        // 풀이 1.
        // 문제를 나눈다.
        // 1. 1부터 n까지의 합 계산 (1<= n && n <= 10)
        // 2. 위 계산의 결과를 전부 더한다.
//        for(int i = 1; i <= 10; i++)
//            for(int j = 1; j <= i; j++)    // j의 조건식을 'j가 i 이하일 때'로 지정하면, 위 계산식 표현이 가능하다.
//                sum = sum + j;             // 별찍기 7번 문제(Star_7) 아이디어 활용

        // 풀이 2.
//            for(int i = 1; i <= 10; i++) {
//                sum += i * (i + 1) / 2;  // 학창시절 배운 공식 적용
//            }

        // 풀이 3.
//        for(int i = 1; i <= 10; i++) {
//            sum += i * (11 - i);
//        }

        // 풀이 4
        int tsum = 0;  // sum의 합을 저장하기 위한 변수 tsum
        for(int i = 1; i <= 10; i++) {
            sum += i;     // sum : i의 합 계산
            tsum += sum;  // tsum : sum의 합 계산
        }
        System.out.println("sum=" + sum);
        System.out.println("tsum=" + tsum);
    }
}
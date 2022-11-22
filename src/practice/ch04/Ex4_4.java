package practice.ch04;

// 1 + (-2) + 3 + (-4) + ... 과 같은 식으로 계속 더해나갔을 때, 몇 까지 더해야 총합이 100이상이 되는지 구하시오.

public class Ex4_4 {
    public static void main(String[] args) {
        // 문제 나누기
        // 1. 짝수일때 수에 -1을 곱해준다.
        // '짝수인 경우'를 나타내는 조건식은 n % 2 == 0으로 표현할 수 있다.
        int sum = 0;  // 총합을 저장하기 위한 변수 sum 선언 및 0으로 초기화
        int i = 1;  // 더해줄 값을 저장하기 위한 변수 i 선언 및 1로 초기화
        while(sum < 100) {  // 조건식 : 총합 sum이 100 미만일 경우 참 => 아래 문장 실행
            int tmp = i;    // i값의 연속성을 유지하기 위해, 임시변수 tmp에 i값을 저장한다.
            if(tmp % 2 == 0)
                tmp = -tmp;

            sum += tmp;
            if(sum < 100)
                i++;
        }
        System.out.println(i);
    }
}

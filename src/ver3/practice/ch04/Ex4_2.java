package ver3.practice.ch04;

// 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.

public class Ex4_2 {
    public static void main(String[] args) {
        int sum = 0; // 문제에 제시된 조건을 만족하는 수의 합을 저장하기 위한 변수 sum 선언 및 0으로 초기화

        // 1. 1부터 20까지의 정수를 순회하며 제시된 '조건'이 참인 정수인지 판별하기 위해 for문을 사용한다.
        // 2. '2 또는 3의 배수가 아닌 수'를 조건식으로 하는 조건문을 사용한다.
        // * i % n == 0을 만족하는 정수 i는 n의 배수이다.
        // 3. 조건식이 참일 때, 해당 정수를 더해준다.

        for(int i = 1; i <= 20; i++) {
            if(!(i % 2 == 0 || i % 3 == 0))
                sum += i;
        }
        System.out.println(sum);

    }
}

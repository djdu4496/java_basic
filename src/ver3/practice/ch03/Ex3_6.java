package ver3.practice.ch03;

// 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
// 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다.
// 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다.
// (1)에 알맞은 코드를 넣으시오
// [Hint] 나머지 연산자를 사용하라.

public class Ex3_6 {
    public static void main(String[] args) {
        int num = 24;

        // 문제 나누기
        // 1. num보다 크면서도 가장 가까운 10의 배수 구하기
        // 2. 위에서 구한 값에서 변수 num을 뺀 값 출력하기

        System.out.println((num - num % 10) + 10 - num);
    }
}

// [실행결과]
// 6
